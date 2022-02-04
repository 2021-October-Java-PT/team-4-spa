package org.wecancodeit.serverside.controllers;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.serverside.models.Rating;
import org.wecancodeit.serverside.models.Recipe;
import org.wecancodeit.serverside.repositories.RecipeRepository;
import org.wecancodeit.serverside.repositories.RatingRepository;

import javax.annotation.Resource;
import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class RecipeController {

    @Resource
    private RecipeRepository recipeRepo;

    @Resource
    private RatingRepository ratingRepo;

    @GetMapping("/api/recipes")
    public Collection<Recipe> getRecipes() {
        return (Collection<Recipe>) recipeRepo.findAll();
    }

    @GetMapping("/api/recipes/{id}")
    public Optional<Recipe> getRecipe(@PathVariable Long id) {
        return recipeRepo.findById(id);
    }

    @PostMapping("/api/recipes/{id}/add-rating")
    public Optional<Recipe> addRatingToRecipe(@RequestBody String body, @PathVariable Long id) throws JSONException{
        System.out.println("=======================");
        System.out.println(body);
        System.out.println(id);
        JSONObject newRating = new JSONObject(body);
        String ratingName = newRating.getString("ratingName");
        Optional<Rating> ratingToAddOpt = ratingRepo.findByName(ratingName);
        if (ratingToAddOpt.isPresent()){
            Optional<Recipe> recipeToAddRatingToOpt = recipeRepo.findById(id);
            Recipe recipeToAddRatingTo = recipeToAddRatingToOpt.get();
            recipeToAddRatingTo.addRating(ratingToAddOpt.get());
            recipeRepo.save(recipeToAddRatingTo);
        }
        else{
            Rating rating = new Rating(ratingName);
            ratingRepo.save(rating);
            Optional<Recipe> recipeToAddRatingToOpt = recipeRepo.findById(id);
            Recipe recipeToAddRatingTo = recipeToAddRatingToOpt.get();
            recipeToAddRatingTo.addRating(rating);
            recipeRepo.save(recipeToAddRatingTo);
        }
        return recipeRepo.findById(id);
    }
}
