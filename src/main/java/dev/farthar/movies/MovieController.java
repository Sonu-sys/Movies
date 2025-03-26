package dev.farthar.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vi/movies")
public class MovieController {
    @Autowired
    private MovieSevice movieSevice;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movies>>(movieServices.allMovies(), HttpStatus.OK)
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovies(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Movie>>(movieSevice.singleMovie(id),HttpStatus.OK)

    }
}
