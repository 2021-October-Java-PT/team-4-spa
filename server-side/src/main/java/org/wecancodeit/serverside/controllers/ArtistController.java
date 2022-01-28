package org.wecancodeit.serverside.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.serverside.models.Artist;
import org.wecancodeit.serverside.repositories.ArtistRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@Controller
public class ArtistController {

    @Resource
    private ArtistRepository artistRepo;

    @GetMapping("/api/artists/{id}")
    public Optional<Artist> getArtist(@PathVariable Long id){
        return artistRepo.findById(id);
    }

    @PostMapping("/api/artists/add-artist")
    public Collection<Artist> addArtist(@RequestBody String body) throws JSONException{
        JSONObject newArtist = new JSONObject(body);
        String name = newArtist.getString("artistName");
        String era = newArtist.getString("artistEra");
        Artist artistToAdd = new Artist(name, era);
        artistRepo.save(artistToAdd);

        return (Collection<Artist>) artistRepo.findAll();
    }
}
