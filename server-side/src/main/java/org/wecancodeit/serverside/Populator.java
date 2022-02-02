package org.wecancodeit.serverside;



import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.serverside.models.*;
import org.wecancodeit.serverside.repositories.*;
import org.wecancodeit.serverside.models.Meal;
import org.wecancodeit.serverside.repositories.MealRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ActivityRepository activityRepo;

    @Resource
    private ArtistRepository artistRepo;

    @Resource
    private WorkOfArtRepository workOfArtRepo;

    @Resource
    private RecipeRepository recipeRepo;

    @Resource
    private MealRepository mealRepo;

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

        Activity learnProgramming = new Activity("Learn a new programming language", "Learn a different programming language and see how it relates to the one(s) you already know!");
        Activity learnSport = new Activity("Learn how to play a new sport", "Learn how to play a different sport with either your friends or by yourself");
        Activity teachDog = new Activity("Teach your dog a new trick", "Teach your dog a new trick and show it off to your parents");
        Activity takeBath = new Activity("Take a bubble bath", "Take a bubble bath and relax for a while");
        activityRepo.save(learnProgramming);
        activityRepo.save(learnSport);
        activityRepo.save(teachDog);
        activityRepo.save(takeBath);

        Meal breakfast = new Meal("Breakfast");
        Meal lunch = new Meal("Lunch");
        Meal dinner = new Meal("Dinner");
        mealRepo.save(breakfast);
        mealRepo.save(lunch);
        mealRepo.save(dinner);

        Recipe learnToCookChickenSoup = new Recipe("Chicken Soup", "6 cups chicken broth, 2 carrots, " +
                "2 stalks of celery, 1 medium onion, 12 oz. of canned chicken, 1 small bunch of parsley, 1/4 cup of rice", "" +
                "Start by cutting the celery and carrots into small pieces. Dice the onion. Get a large stock pot, add a table spoon of oil, and bring up to medium heat. " +
                "Add the vegetables and head them up until the unions turn slightly clear. Add a small amount of salt and pepper. Next add the chickem and" +
                "chicken broth.  Turn up to medium-high until it comes to a boil. Add the rice.  Cover the pot. Turn the heat down to low." +
                "Let the soup simmer until the vegetables and rice are tender and soft.  Chop up the parley leaves and add to the pot. " +
                "Give it a taste and add salt and pepper as needed.", lunch);
        Recipe learnToCookPigsInABlanket = new Recipe("Pigs In A Blanket", "2" +
                "cans (8 oz) refrigerated Pillsbury™ Original Crescent Rolls (8 Count), 48" +
                "cocktail-size smoked link sausages or hot dogs (from two 14-oz packages)",
                "Heat oven to 375°F. Unroll both cans of the dough; separate into 16 triangles. " +
                        "Cut each triangle lengthwise into 3 narrow triangles. Place sausage on shortest side " +
                        "of each triangle. Roll up each, starting at shortest side of triangle and rolling to " +
                        "opposite point; place point side down on 2 ungreased cookie sheets." +
                        "Bake 12 to 15 minutes or until golden brown, switching position of cookie sheets " +
                        "halfway through baking. Immediately remove from cookie sheet. Serve warm.",lunch);
        Recipe learnToCookMacAndCheese = new Recipe("Mac and Cheese", "1 1/2 cups of water, 1 cup milk, 2 cups macaroni, 8-10 slices of " +
                "deli American cheese, 1 teaspoon Dijon mustard, 1 cup shredded cheddar cheese.", "In medium saucepan, " +
                "combine water and milk. Bring to boil over high heat. Carefully add macaroni to saucepan and reduce heat " +
                "to medium-low. Cook, stirring occasionally with wooden spoon, until macaroni is soft, about 7 minutes. While " +
                "macaroni is cooking, tear American cheese slices into small pieces. When macaroni is soft, add American " +
                "cheese pieces and mustard to saucepan and cook, stirring constantly, until cheese is completely melted, " +
                "about 1 minute. Turn off heat. Add cheddar and stir until evenly combined. Cover saucepan with lid and let sit for 5 minutes." +
                "Use oven mitts to remove lid. Stir until sauce is smooth (sauce may look loose but will thicken as it cools). Serve immediately.", lunch);
        Recipe learnToCookLazyLasagna = new Recipe("Lazy Lasagna","1 (24oz) bag of frozen cheese ravioli, 1 (24oz) jar of marinara or pasta sauce, 2 cups shredded " +
                "mozzarella (heaping), 1/2 cup shredded parmesan (optional)", "Preheat your oven to 400 degrees and grease a 9x13 baking dish." +
                "Spread a thin layer of your marinara sauce onto the bottom of the pan (about 3/4 cup). " +
                "Arrange half of the frozen ravioli in a single layer over the sauce (should be about 12 of them)." +
                "Top with half of the remaining sauce and half of the mozzarella. Repeat the layers starting with what's left of the ravioli. Finish " +
                "by topping with the remaining sauce and cheese. Sprinkle with parmesan if you'd like. Cover the baking dish with aluminum foil, and " +
                "bake for 30 minutes. Remove the foil, and continue baking for an additional 15 minutes, or until the cheese starts to brown. ",dinner);
        Recipe learnToCookChickenTacos = new Recipe("Chicken Tacos", "3-4 chicken breasts," +
                "1 (16oz) jar of salsa, (8oz) cream cheese (cubed), taco seasoning (optional)," +
                "tortillas for serving (optional)", "Spray your slow cooker with non-stick cooking spray. Place the chicken, salsa, cream " +
                "cheese, and optional taco seasoning in and cook on HIGH for 3 hours (or LOW for 4-5 hours)." +
                "Shred with a fork and let the chicken absorb the salsa mixture for at least 15 more minutes. " +
                "Serve in soft tortillas, taco shells, or over a bed of lettuce. Top with shredded cheese, tomatoes, avocado " +
                "or anything else you'd like!", dinner);
        recipeRepo.save(learnToCookChickenSoup);
        recipeRepo.save(learnToCookPigsInABlanket);
        recipeRepo.save(learnToCookMacAndCheese);
        recipeRepo.save(learnToCookLazyLasagna);
        recipeRepo.save(learnToCookChickenTacos);


    }
}
