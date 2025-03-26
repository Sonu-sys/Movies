package dev.farthar.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/movies")

public class ReviewController {
    @Autowired
    private  ReviewService reviewService;
    @postMapping
    public ResponseEntity<Review> CreateReview(@RequestBody Map<String, String> payload){
        Return new ResponseEntity<Review>(reviewService.createReview(payload.get(reviewbody)), payload.get(imbd), HttpStatusCode.CREATED)
    }
}

