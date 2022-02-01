package org.wecancodeit.serverside.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;
    private String dish;
    private String ingredients;
    @Lob
    private String directions;

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


