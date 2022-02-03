package org.wecancodeit.serverside.controllers;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.serverside.models.Recipe;
import org.wecancodeit.serverside.repositories.RecipeRepository;

import javax.annotation.Resource;
import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class RecipeController {

    @Resource
    private RecipeRepository recipeRepo;

    @GetMapping("/api/recipes")
    public Collection<Recipe> getRecipes() {
        return (Collection<Recipe>) recipeRepo.findAll();
    }

    @GetMapping("/api/recipes/{id}")
    public Optional<Recipe> getRecipe(@PathVariable Long id) {
        return recipeRepo.findById(id);
    }


}
