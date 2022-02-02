package org.wecancodeit.serverside.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
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

    @ManyToOne
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


