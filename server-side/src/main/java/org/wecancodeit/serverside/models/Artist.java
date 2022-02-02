//package org.wecancodeit.serverside.models;
//
//import antlr.actions.python.CodeLexer;
//
//
//import javax.persistence.*;
//import java.util.Collection;
//
//@Entity
//public class Artist {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    private String name;
//    private String era;
//    @OneToMany(mappedBy = "artist")
//
//    private Collection<WorkOfArt> worksOfArt;
//
//
//    public Collection<WorkOfArt> getWorksOfArt() {
//        return worksOfArt;
//    }
//
//    public Artist(){
//
//    }
//
//    public Artist(String name, String era) {
//        this.name = name;
//        this.era = era;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEra() {
//        return era;
//    }
//}
//
