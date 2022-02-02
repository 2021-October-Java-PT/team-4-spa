package org.wecancodeit.serverside.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Meal {

    @Id
    @GeneratedValue
    private Long id;
    private String timeOfDay;
    @OneToMany(mappedBy = "meal")
    @JsonIgnore
    private Collection<Recipe> recipes;

    public Long getId() {
        return id;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public Meal(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public Meal() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Objects.equals(id, meal.id);
    }
}
