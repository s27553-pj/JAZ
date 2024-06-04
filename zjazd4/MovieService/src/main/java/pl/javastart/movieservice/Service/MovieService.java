package pl.javastart.movieservice.Service;

import org.springframework.stereotype.Service;
import pl.javastart.movieservice.Exception.NotFoundMoviesException;
import pl.javastart.movieservice.Model.Movie;
import pl.javastart.movieservice.Repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    //    private final List<Movie> movieList = new ArrayList<>();
    private final MovieRepository movieRepository;

    public List<Movie> getMovies() {
        return movieRepository.findAll();
//        return movieList;
    }

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
//        generateList();
    }

    public Movie getMoviesById(Long id) {
        return movieRepository
                .findById(id)
                .orElseThrow(NotFoundMoviesException::new);
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Long id, Movie updatedMovie) {
        Movie existingMovie = movieRepository.findById(id)
                .orElseThrow(NotFoundMoviesException::new);
        existingMovie.setId(updatedMovie.getId());
        existingMovie.setCategory(updatedMovie.getCategory());
        existingMovie.setName(updatedMovie.getName());
        return movieRepository.save(updatedMovie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
    public Movie setAvailableTrue(Long id){
        Movie existingMovie = movieRepository.findById(id)
                .orElseThrow(NotFoundMoviesException::new);
        existingMovie.setAvailable(true);
        return movieRepository.save(existingMovie);

    }
    public Movie setAvailableFalse(Long id){
        Movie existingMovie = movieRepository.findById(id)
                .orElseThrow(NotFoundMoviesException::new);
        existingMovie.setAvailable(false);
        return movieRepository.save(existingMovie);

    }
}

//    public void generateList() {
//        movieList.add(new Movie(1, "Deadpool", Category.COMEDY));
//        movieList.add(new Movie(2, "Silence", Category.HORROR));
//        movieList.add(new Movie(3, "Avatar", Category.FANTASY));
//        movieList.add(new Movie(4, "Avatar", Category.FANTASY));
//
//    }

//    public String throwException(boolean NotFoundMoviesException) {
//        if (NotFoundMoviesException) {
//            throw new RuntimeException();
//        }
//        return "Exception was not thrown";
//    }

//    public Movie getMoviesById(Integer id) {
//        for (Movie movie : movieList) {
//            if (movie.getId().equals(id)) {
//                return movie;
//            }
//        }
//        throw new NotFoundMoviesException("Movies by " + id + " was not found");
//    }
//    public Movie getMoviesById(Long id){
//    private Integer generateId() {
//        return movieList.size() + 1;
//    }

//    public Movie createMovie(Movie movie) {
//
//        movie.setId(generateId());
//        movieList.add(movie);
//        return movie;
    //}

//    public Movie updateMovie(Movie updatedMovie) {
//
//        Integer id = updatedMovie.getId();
//        movieList.replaceAll(movie -> {
//            if (movie.getId().equals(id)) {
//                movie.setName(updatedMovie.getName());
//                movie.setCategory(updatedMovie.getCategory());
//            }
//            return movie;
//        });
//        boolean movieExists = movieList
//                .stream()
//                .anyMatch(movie -> movie.getId().equals(id));
//        if (movieExists) {
//            return updatedMovie;
//        } else {
//            throw new NotFoundMoviesException("Movie by id " + id + " doesn't exist");
//        }

    //}
//    public void deleteMovie(Long id) {
//        movieRepository.deleteById(id);
//        Optional<Movie> deletedMovie  = movieList.stream()
//                        .filter(movie -> movie.getId().equals(id))
//                        .findFirst();
//        if (deletedMovie.isPresent()){
//            movieList.removeIf(movie -> movie.getId().equals(id));
//            return deletedMovie.get();
//        } else {
//            throw new NotFoundMoviesException("Movie by id " + id + " doesn't exist");
//        }
    //}
//}
