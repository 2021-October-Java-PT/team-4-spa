package org.wecancodeit.serverside.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Activity {

    @Id
    @GeneratedValue
    private Long id;
    private String nameOfActivity;
    private String descriptionOfActivity;

    public Activity() {

    }

    public Activity(String nameOfActivity, String descriptionOfActivity) {
        this.nameOfActivity = nameOfActivity;
        this.descriptionOfActivity = descriptionOfActivity;
    }

    public Long getId() {
        return id;
    }

    public String getNameOfActivity() {
        return nameOfActivity;
    }

    public String getDescriptionOfActivity() {
        return descriptionOfActivity;
    }
}

