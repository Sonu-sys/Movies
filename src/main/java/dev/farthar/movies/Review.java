package dev.farthar.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="revies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
   @Id
    private ObjectId id;
   private String body;

    public Review(String body) {
        this.body = body;
    }
}
