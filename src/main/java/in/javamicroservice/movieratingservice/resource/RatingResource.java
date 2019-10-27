package in.javamicroservice.movieratingservice.resource;

import in.javamicroservice.movieratingservice.models.Rating;
import in.javamicroservice.movieratingservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource
{

    @RequestMapping("/movies/{movieId}")
    public Rating getRatingResource(@PathVariable("movieId") String movieId )
    {

    }

    @RequestMapping("/user/{userID}")
    public UserRating getUserRating()
    {

    }

}
