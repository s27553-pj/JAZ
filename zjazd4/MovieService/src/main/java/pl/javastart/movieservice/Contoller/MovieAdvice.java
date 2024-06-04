package pl.javastart.movieservice.Contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.javastart.movieservice.Exception.NotFoundMoviesException;

@RestControllerAdvice
public class MovieAdvice {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(NotFoundMoviesException e){
        return ResponseEntity
                .status(HttpStatusCode.valueOf(404))
                .body("Exception occured on request. Exception message: " + e.getLocalizedMessage());
    }
}
