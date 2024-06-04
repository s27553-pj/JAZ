package pl.javastart.movieservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.movieservice.Model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
