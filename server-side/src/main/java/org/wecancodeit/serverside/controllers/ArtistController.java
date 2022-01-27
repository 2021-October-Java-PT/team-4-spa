package org.wecancodeit.serverside.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.serverside.repositories.ArtistRepository;

import javax.annotation.Resource;

@Controller
public class ArtistController {

    @Resource
    private ArtistRepository artistRepo;

    @RequestMapping("/artists")
    public StringdisplayArtists(Model model){
        model.addAttribute()
    }
}
