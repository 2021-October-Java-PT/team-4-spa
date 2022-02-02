package org.wecancodeit.serverside.controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.wecancodeit.serverside.models.Recipe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Meal {

    @Id
    @GeneratedValue
    private Long id;
    private String timeOfDay;
    @OneToMany(mappedBy = "meal")
    @JsonIgnore
    private Collection<Recipe> recipes;

    public Long getId(){
        return id;
    }

    public String getTimeOfDay(){
        return timeOfDay;
    }

    public Meal(String timeOfDay){
        this.timeOfDay = timeOfDay;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public Meal(){

    }
}
