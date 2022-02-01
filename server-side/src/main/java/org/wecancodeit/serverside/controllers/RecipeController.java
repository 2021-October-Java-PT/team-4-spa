package org.wecancodeit.serverside.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.serverside.models.Recipe;
import org.wecancodeit.serverside.repositories.RecipeRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
public class RecipeController {

    @Resource
    private RecipeRepository recipeRepo;

    @GetMapping("/api/recipes")
    public Collection<Recipe> getRecipes(){
        return (Collection<Recipe>) recipeRepo.findAll();
    }

    @GetMapping("/api/recipes/{id}")
    public Optional<Recipe> getRecipe(@PathVariable Long id){
        return recipeRepo.findById(id);
    }

}
