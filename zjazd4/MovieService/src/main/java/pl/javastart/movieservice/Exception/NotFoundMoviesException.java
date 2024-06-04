package pl.javastart.movieservice.Exception;

public class NotFoundMoviesException extends RuntimeException {
    public NotFoundMoviesException() {
        super("Movie not found");
    }
}
