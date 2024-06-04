package pl.javastart.rentalservice.Service;

import pl.javastart.rentalservice.Model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {
    private final RestTemplate restTemplate;
@Autowired
    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public Movie getMovie(Long id) {
    return restTemplate.getForObject("http://localhost:8081/movies/" + id, Movie.class);
    }
    public Movie returnMovie(Long id){
    restTemplate.put("http://localhost:8081/" + id + "/available",null);
    return getMovie(id);
    }

    public Movie rentMovie(Long id){
        restTemplate.put("http://localhost:8081/" + id + "/notavailable",null);
        return getMovie(id);
    }

}
