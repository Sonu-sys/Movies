package dev.farthar.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReveiwService {
    @Autowired
    private  ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public Review createReview(String reviewBody,String imdbId)
    {
        Review review=new Review(reviewBody);
        reviewRepository.insert(review);
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where(key "imbId").is(imbid))
                .appy(new update().push(Key "imbId"))



    }
}
