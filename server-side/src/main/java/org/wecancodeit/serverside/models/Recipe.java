package org.wecancodeit.serverside.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;
    private String dish;
    @Lob
    private String ingredients;
    @Lob
    private String directions;
    @ManyToOne
    private Meal meal;
    @ManyToMany
    private Set<Rating> ratings;

    public Recipe() {

    }


    public Recipe(String dish, String ingredients, String directions, Meal meal) {
        this.dish = dish;
        this.ingredients = ingredients;
        this.directions = directions;
        this.meal = meal;
        this.ratings = new HashSet<>();
    }

    public Collection<Rating> getRatings() {
        return ratings;
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

    public Meal getMeal() {
        return meal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(id, recipe.id);
    }

    public void addRating(Rating ratingToAdd) {
        ratings.add(ratingToAdd);
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}


