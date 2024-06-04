package pl.javastart.movieservice.Exception;

public class InvalidMovieDataException extends RuntimeException{
    public InvalidMovieDataException(String message){
        super(message);
    }
}
