package org.wecancodeit.serverside.controllers;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.serverside.models.Rating;
import org.wecancodeit.serverside.repositories.RatingRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class RatingController {

    @Resource
    private RatingRepository ratingRepo;

    @GetMapping("/api/ratings")
    public Collection<Rating> getRatings() {
        return (Collection<Rating>) ratingRepo.findAll();
    }

    @PostMapping("/api/add-rating")
    public Collection<Rating> addRating(@RequestBody String body) throws JSONException {
        JSONObject newRating = new JSONObject(body);
        String ratingName = newRating.getString("ratingName");
        Optional<Rating> ratingToAddOpt = ratingRepo.findByName(ratingName);
        if (ratingToAddOpt.isEmpty()) {
            Rating ratingToAdd = new Rating(ratingName);
            ratingRepo.save(ratingToAdd);
        }
        return (Collection<Rating>) ratingRepo.findAll();
    }
}
