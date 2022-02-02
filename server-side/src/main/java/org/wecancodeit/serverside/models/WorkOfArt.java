//package org.wecancodeit.serverside.models;
//
//
//
//import javax.persistence.*;
//
//
//@Entity
//public class WorkOfArt {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    private String titleOfWork;
//    private String medium;
//    @Lob
//    private String description;
//    @ManyToOne
//    private Artist artist;
//
//    public WorkOfArt() {
//    }
//
//    public WorkOfArt(String titleOfWork, String medium, String description, Artist artist) {
//        this.titleOfWork = titleOfWork;
//        this.medium = medium;
//        this.description = description;
//        this.artist = artist;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getTitleOfWork() {
//        return titleOfWork;
//    }
//
//    public String getMedium() {
//        return medium;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public Artist getArtist() {
//        return artist;
//    }
//}
//
//
