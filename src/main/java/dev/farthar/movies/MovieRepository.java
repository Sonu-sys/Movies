package dev.farthar.movies;

import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepositoriesAutoConfiguration<Movie,ObjectId> {
    public Optional<Movie> findMovieByImdbId(string, imbId) ;


}



