package org.wecancodeit.serverside.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;
    private String dish;
    private String ingredients;
    @Lob
    private String directions;
    @JsonIgnore
    private Collection<Recipe> recipes;


    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public Recipe(){


    }

    public Recipe(String dish, String ingredients, String directions) {
        this.dish = dish;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public Long getId() {
        return id;
    }

    public String getDish() {
        return dish;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getDirections() {
        return directions;
    }
}


