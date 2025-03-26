package dev.farthar.movies;


import java.lang.annotation.Documented;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.comre.mapping.document;

@Documented(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private string imbdId;
    private string title;
    private string relasedate;
    Private string poster;
    private List<string> genres;
    @DocumentRefrence
    private List<string> backdrop;


}
