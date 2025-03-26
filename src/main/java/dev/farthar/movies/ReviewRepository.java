package dev.farthar.movies;

import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends {
} MongoRepositoriesAutoConfiguration<Review, ObjectId>
