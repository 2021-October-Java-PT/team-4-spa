package org.wecancodeit.serverside.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy ="ratings")
    @JsonIgnore
    private Collection<Recipe> recipes;

    public Rating(){

    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Collection<Recipe> getRecipes(){
        return recipes;
    }

    public Rating(String name){
        this.name = name;
        recipes = new ArrayList<>();
    }
}
