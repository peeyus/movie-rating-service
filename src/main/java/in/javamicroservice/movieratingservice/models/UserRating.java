package in.javamicroservice.movieratingservice.models;

import java.util.List;

public class UserRating
{
    private String userId;
    private List<Rating> rating;

    public UserRating(String userId, List<Rating> rating) {
        this.userId = userId;
        this.rating = rating;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRating(List<Rating> rating) {
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public List<Rating> getRating() {
        return rating;
    }
}
