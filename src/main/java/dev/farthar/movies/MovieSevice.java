package dev.farthar.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class MovieSevice {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }

    @GetMapping
    public ResponseEntity<String> getAllMovies(){
        return new ResponseEntity<String>(body:"All Movies!", HttpStatus.ok)

    }
   public Optional<Movie> singleMovie(ObjectId id){
        return movieRepository.findById(id);
   }
}
