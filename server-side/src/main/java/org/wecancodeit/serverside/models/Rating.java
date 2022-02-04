package org.wecancodeit.serverside.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return Objects.equals(id, rating.id);
    }

    public int hashCode(){
        return Objects.hash(id);
    }
}
