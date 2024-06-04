package pl.pjatk.KatKas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.catalog.Catalog;

@RestController
@RequestMapping("/test")
public class cw1Controller {
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World");
    }
    @GetMapping("/model")
    public ResponseEntity<Object> showObject(){
        return ResponseEntity.ok(new Car("Passat",20,2000));
   }
    @GetMapping("/hello/{value}")
    public ResponseEntity<String> showString(@PathVariable String value ){
        return ResponseEntity.ok(value);
    }
    @GetMapping("/hello/RequestParam")
    public ResponseEntity<String> showParam(@RequestParam String value){
        return ResponseEntity.ok(value);
    }
    @PostMapping("/model")
    public ResponseEntity<Car> showBody(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }
}
