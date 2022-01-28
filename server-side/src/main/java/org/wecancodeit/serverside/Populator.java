package org.wecancodeit.serverside;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.serverside.repositories.ActivityRepository;
import org.wecancodeit.serverside.repositories.ArtistRepository;
import org.wecancodeit.serverside.repositories.WorkOfArtRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ActivityRepository activityRepo;

    @Resource
    private ArtistRepository artistRepo;

    @Resource
    private WorkOfArtRepository workOfArtRepo;

    @Override
    public void run(String...args) throws Exception{


    }
}
