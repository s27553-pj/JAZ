package pl.javastart.movieservice.Contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.javastart.movieservice.Exception.InvalidMovieDataException;
import pl.javastart.movieservice.Exception.NotFoundMoviesException;
import pl.javastart.movieservice.Model.Movie;
import pl.javastart.movieservice.Service.MovieService;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getMovies(){
        List<Movie> movies = movieService.getMovies();
        return ResponseEntity
                .ok(movies);
    }
    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMoviesById(@PathVariable Long id){
        return ResponseEntity
                .ok(movieService.getMoviesById(id));
    }
    @PostMapping("/movies")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.createMovie(movie);
        return ResponseEntity
                .ok(createdMovie);

}
    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie updatedMovie) {
            Movie updated = movieService.updateMovie(id, updatedMovie);
            return ResponseEntity.ok(updated);
    }
    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id){
            movieService.deleteMovie(id);
            return ResponseEntity.noContent().build();

    }
    @PutMapping("{id}/available")
    public ResponseEntity<Movie> setAvailableTrue(@PathVariable Long id){
        Movie setAv = movieService.setAvailableTrue(id);
        return ResponseEntity.ok(setAv);
    }
    @PutMapping("{id}/notavailable")
    public ResponseEntity<Movie> setAvailableFalse(@PathVariable Long id){
        Movie setAv = movieService.setAvailableFalse(id);
        return ResponseEntity.ok(setAv);
    }
}

