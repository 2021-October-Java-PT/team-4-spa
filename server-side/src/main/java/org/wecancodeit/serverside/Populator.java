package org.wecancodeit.serverside;


import org.hibernate.jdbc.Work;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.serverside.models.Artist;
import org.wecancodeit.serverside.models.WorkOfArt;
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

        Artist vanGogh = new Artist("Vincent Van Gogh", "1853-1890");
        Artist inman = new Artist("Henry Inman", "1801-1846");
        Artist homer = new Artist("Winslow Homer", "1836-1910");
        Artist wright = new Artist("Mary Wright", "1740-1829");
        Artist hamilton = new Artist("James Hamilton", "1819-1878");
        artistRepo.save(vanGogh);
        artistRepo.save(inman);
        artistRepo.save(homer);
        artistRepo.save(wright);
        artistRepo.save(hamilton);

        WorkOfArt shoes = new WorkOfArt("Shoes", "Oil on canvas", "Van Gogh painted several still lifes of shoes or boots during his Paris period. This picture, painted later, in Arles, evinces a unique return to the earlier motif. However, here Van Gogh has placed the shoes within a specific spatial context: namely, the red-tile floor of the Yellow House. Not only may we identify the setting, but perhaps the owner of the shoes as well. It has been suggested that this \"still life of old peasants' shoes\" may have been those of Patience Escalier, whose portrait Van Gogh executed around the same time, late summer 1888.", vanGogh);
        WorkOfArt eagleOfDelight = new WorkOfArt("Hayne Hudjihini, Eagle of Delight", "Oil on Canvas", "Inman’s portraits of Native Americans were painted in preparation for hand-colored lithographs to be made for a publication by the Head of Indian Affairs, Thomas L. McKenney—\"The History of the Indian Tribes of North America\" (1836–44). These distinguished leaders had originally been painted from life by Charles Bird King, when invited to Washington in 1822. King’s portraits were destroyed in a fire at the Smithsonian Institution in 1865. This rare portrayal of a Native American woman, Hayne Hudjihini, Eagle of Delight—wife of Sumonyeacathee, Chief of the Otoe-Missouria people—emphasizes her distinctive beauty and bearing. She is adorned with earrings, necklaces, and a silver bracelet.", inman);
        WorkOfArt bass = new WorkOfArt("Channel Bass", "Watercolor and graphite on white wove paper", "None", homer);
        WorkOfArt embroideredPicture = new WorkOfArt("Embroidered Picture", "Linen embroidered with wool and silk thread", "At age fourteen Mary Wright, the only child of a prosperous farmer and brickyard owner in Middletown, Connecticut, was sent to school in Newport. In the mid-eighteenth century few schools in Connecticut taught more than the basics of reading, writing, and arithmetic. In order to gain the necessary feminine accomplishments, well-to-do girls were usually sent to either Boston or Newport. While at school Mary completed at least two needlework pictures based on engravings depicting the four seasons.", wright);
        WorkOfArt beachScene = new WorkOfArt("Beach Scene", "Watercolor and gouache on off-white wove paper", "Several American landscape artists, from Frederic E. Church to William Trost Richards to James Hamilton, garnered the honorific “American Turner,” after the visionary British master Joseph M.W. Turner, who died in 1852 just as the age of landscape painting in America was coming to fruition. Perhaps none better than the Philadelphian Hamilton earned the sobriquet for the expressionistic technical liberties he indulged after Turner’s example. Hamilton may have more conspicuously been a student of Turner’s contemporary John “Pandemonium” Martin. Martin’s streamlined stylization of terrestrial and celestial forms presages the same features in Hamilton’s work in both oil and watercolor, such as this otherworldly scene based probably on the Jersey shore at Atlantic City, which Hamilton began visiting in the 1860s.", hamilton);
        workOfArtRepo.save(shoes);
        workOfArtRepo.save(eagleOfDelight);
        workOfArtRepo.save(bass);
        workOfArtRepo.save(embroideredPicture);
        workOfArtRepo.save(beachScene);

        



    }
}
