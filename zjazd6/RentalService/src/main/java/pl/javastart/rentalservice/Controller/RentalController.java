package pl.javastart.rentalservice.Controller;

import pl.javastart.rentalservice.Model.Movie;
import pl.javastart.rentalservice.Service.RentalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RentalController {
    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable  Long id){
        return ResponseEntity.ok(rentalService.getMovie(id));
    }
    @PutMapping("{id}/available")
    public ResponseEntity<Movie> returnMovie(@PathVariable Long id){
        return ResponseEntity.ok(rentalService.returnMovie(id));
    }
    @PutMapping("{id}/notavailable")
    public ResponseEntity<Movie> rentMovie(@PathVariable Long id){
        return ResponseEntity.ok(rentalService.rentMovie(id));
    }
}
