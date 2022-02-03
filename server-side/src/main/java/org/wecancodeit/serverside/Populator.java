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

//    @Resource
//    private ActivityRepository activityRepo;
//
//    @Resource
//    private ArtistRepository artistRepo;
//
//    @Resource
//    private WorkOfArtRepository workOfArtRepo;

    @Resource
    private RecipeRepository recipeRepo;

    @Resource
    private MealRepository mealRepo;

    @Override
    public void run(String... args) throws Exception {


        Meal breakfast = new Meal("Breakfast");
        Meal lunch = new Meal("Lunch");
        Meal dinner = new Meal("Dinner");
        mealRepo.save(breakfast);
        mealRepo.save(lunch);
        mealRepo.save(dinner);

        Recipe learnToCookChickenSoup = new Recipe("Chicken Soup", "6 cups chicken broth, 2 carrots, " +
                "2 stalks of celery, 1 medium onion, 12 oz. of canned chicken, 1 small bunch of parsley, 1/4 cup of rice", "" +
                "1. Start by cutting the celery and carrots into small pieces and dice the onion. 2. Get a large stock pot, add a table spoon of oil, and bring up to medium heat. " +
                "3. Add the vegetables and head them up until the unions turn slightly clear. Add a small amount of salt and pepper. 4. Next add the chicken and" +
                "chicken broth.  Turn up to medium-high until it comes to a boil. 5. Add the rice.  Cover the pot. Turn the heat down to low." +
                "5. Let the soup simmer until the vegetables and rice are tender and soft.  Chop up the parley leaves and add to the pot. " +
                "Give it a taste and add salt and pepper as needed.", lunch);
        Recipe learnToCookPigsInABlanket = new Recipe("Pigs In A Blanket", "2" +
                "cans (8 oz) refrigerated Pillsbury™ Original Crescent Rolls (8 Count), 48" +
                "cocktail-size smoked link sausages or hot dogs (from two 14-oz packages)",
                "1. Heat oven to 375°F. 2. Unroll both cans of the dough; separate into 16 triangles. " +
                        "3. Cut each triangle lengthwise into 3 narrow triangles. Place sausage on shortest side " +
                        "of each triangle. Roll up each, starting at shortest side of triangle and rolling to " +
                        "opposite point; place point side down on 2 ungreased cookie sheets. " +
                        "4. Bake 12 to 15 minutes or until golden brown, switching position of cookie sheets " +
                        "halfway through baking. 5. Immediately remove from cookie sheet. Serve warm.", lunch);
        Recipe learnToCookMacAndCheese = new Recipe("Mac and Cheese", "1 1/2 cups of water, 1 cup milk, 2 cups macaroni, 8-10 slices of " +
                "deli American cheese, 1 teaspoon Dijon mustard, 1 cup shredded cheddar cheese.", "1. In medium saucepan, " +
                "combine water and milk. Bring to boil over high heat. 2. Carefully add macaroni to saucepan and reduce heat " +
                "to medium-low. Cook, stirring occasionally with wooden spoon, until macaroni is soft, about 7 minutes. 3. While " +
                "macaroni is cooking, tear American cheese slices into small pieces. When macaroni is soft, add American " +
                "cheese pieces and mustard to saucepan and cook, stirring constantly, until cheese is completely melted, " +
                "about 1 minute. 4. Turn off heat. Add cheddar and stir until evenly combined. Cover saucepan with lid and let sit for 5 minutes." +
                "5. Use oven mitts to remove lid. Stir until sauce is smooth (sauce may look loose but will thicken as it cools). Serve immediately.", lunch);
        Recipe learnToCookLazyLasagna = new Recipe("Lazy Lasagna", "1 (24oz) bag of frozen cheese ravioli, 1 (24oz) jar of marinara or pasta sauce, 2 cups shredded " +
                "mozzarella (heaping), 1/2 cup shredded parmesan (optional)", "1. Preheat your oven to 400 degrees and grease a 9x13 baking dish." +
                "2. Spread a thin layer of your marinara sauce onto the bottom of the pan (about 3/4 cup). " +
                "3. Arrange half of the frozen ravioli in a single layer over the sauce (should be about 12 of them). " +
                "4. Top with half of the remaining sauce and half of the mozzarella. 5. Repeat the layers starting with what's left of the ravioli. Finish " +
                "by topping with the remaining sauce and cheese. Sprinkle with parmesan if you'd like. 6. Cover the baking dish with aluminum foil, and " +
                "bake for 30 minutes. Remove the foil, and continue baking for an additional 15 minutes, or until the cheese starts to brown. ", dinner);
        Recipe learnToCookChickenTacos = new Recipe("Chicken Tacos", "3-4 chicken breasts," +
                "1 (16oz) jar of salsa, (8oz) cream cheese (cubed), taco seasoning (optional)," +
                "tortillas for serving (optional)", "1. Spray your slow cooker with non-stick cooking spray. Place the chicken, salsa, cream " +
                "cheese, and optional taco seasoning in and cook on HIGH for 3 hours (or LOW for 4-5 hours)." +
                "2. Shred with a fork and let the chicken absorb the salsa mixture for at least 15 more minutes. " +
                "3. Serve in soft tortillas, taco shells, or over a bed of lettuce. Top with shredded cheese, tomatoes, avocado " +
                "or anything else you'd like!", dinner);
        Recipe learnToCookBreakfastBurritos = new Recipe("Breakfast Burritos", "1 medium flour tortilla, 1 egg (if you are not doing any add-on " +
                "ingredients, you may want to do 2 eggs instead of 1), Salt & pepper, 1 teaspoon butter, Optional add-ons: (*Chopped breakfast sausage, ham, or bacon (heated) *Avocado slices or guacamole *Salsa *Shredded cheese *Breakfast potatoes or hashbrowns)",
                "1. Crack an egg into a small bowl. Add two pinches salt and whisk the egg well. Set " +
                "aside. 2. Assemble any add-ons that you want to include in the burrito and have them set aside and ready to go." +
                "3. Heat a medium-size frying pan over medium-high heat (on a dial from 1-10, set to 7 or 8).  4. On a separate burner but at the same time, " +
                "heat a small frying pan over medium heat on the stove (on a dial from 1-10, set to 5). Let the two pans heat for 3-5 minutes. 5. Place " +
                "the flour tortilla in the medium-size pan and heat for about 30-60 seconds, then flip and heat the tortilla on the second side for 30-60 " +
                "seconds. Tortilla should be hot and starting to brown a bit in spots.  Remove the tortilla from the pan and place on plate. Turn " +
                "off the burner for the medium-size pan. 6. Add butter to small frying pan and spread the butter around with a spatula. Pour the egg into the " +
                "pan and tip the pan to spread the egg around. You can push the edges of the egg in towards the center of the pan and then tip the pan " +
                "to have the liquid egg spread back out to the edge of the pan. Flip the egg to finish cooking completely then slide it onto the flour " +
                "tortilla on the plate. The egg does not need to be pretty, it can get scrambled and flipped, no biggie! 7. Turn off the stove burner for " +
                "the small frying pan. The egg will cook very quickly, probably 30-45 seconds total. Place the add-on ingredients on top of the egg " +
                "(if using), sprinkle with a little salt and pepper, then wrap the egg and add-ons in the tortilla like a burrito.", breakfast );
        Recipe learnToCookFrenchToast = new Recipe("French Toast", "2 large slices" +
                "hearty sandwich bread, ½ cup" +
                "milk, 1 tablespoon" +
                "unsalted butter cut in half, 1" +
                "large egg yolk,1 tablespoon" +
                "packed brown sugar, 1 teaspoon" +
                "vanilla extract, ⅛ teaspoon" +
                "ground cinnamon, Pinch salt", "1. Place bread in toaster on lowest setting. Toast until bread feels dried out and is very light " +
                "brown. (You may have to toast it twice.)  2. Place milk and 1 piece of butter in medium microwave-safe bowl. Heat in microwave until " +
                "butter is melted and milk is warm, 30 seconds to 1 minute. Add egg yolk, sugar, vanilla, cinnamon, and salt to bowl with milk mixture " +
                "and whisk to combine. Transfer mixture to pie plate or small baking dish.  3. Soak first side of 1 bread slice in milk mixture until it " +
                "is wet but not falling apart, 20 seconds. Flip bread and soak second side for 20 seconds. Use spatula to remove bread from milk " +
                "mixture, letting extra liquid drip back into dish. 4. Transfer soaked bread to plate and repeat with remaining bread slice.  5. Melt remaining " +
                "piece of butter in 12-inch nonstick skillet over medium-low heat. 6. Use spatula to transfer bread slices to skillet. Cook until golden on " +
                "first side, 3 to 4 minutes. Wipe spatula clean, flip slices, and cook until golden on second side, 3 to 4 minutes. Turn off heat. " +
                "Transfer french toast to clean plate. 7. Serve with maple syrup, confectioners’ sugar, cinnamon sugar, butter, and/or fresh fruit.", breakfast);
        recipeRepo.save(learnToCookChickenSoup);
        recipeRepo.save(learnToCookPigsInABlanket);
        recipeRepo.save(learnToCookMacAndCheese);
        recipeRepo.save(learnToCookLazyLasagna);
        recipeRepo.save(learnToCookChickenTacos);
        recipeRepo.save(learnToCookBreakfastBurritos);
        recipeRepo.save(learnToCookFrenchToast);

//        Artist vanGogh = new Artist("Vincent Van Gogh", "1853-1890");
//        Artist inman = new Artist("Henry Inman", "1801-1846");
//        Artist homer = new Artist("Winslow Homer", "1836-1910");
//        Artist wright = new Artist("Mary Wright", "1740-1829");
//        Artist hamilton = new Artist("James Hamilton", "1819-1878");
//        artistRepo.save(vanGogh);
//        artistRepo.save(inman);
//        artistRepo.save(homer);
//        artistRepo.save(wright);
//        artistRepo.save(hamilton);
//
//        WorkOfArt shoes = new WorkOfArt("Shoes", "Oil on canvas", "Van Gogh painted several still lifes of shoes or boots during his Paris period. This picture, painted later, in Arles, evinces a unique return to the earlier motif. However, here Van Gogh has placed the shoes within a specific spatial context: namely, the red-tile floor of the Yellow House. Not only may we identify the setting, but perhaps the owner of the shoes as well. It has been suggested that this \"still life of old peasants' shoes\" may have been those of Patience Escalier, whose portrait Van Gogh executed around the same time, late summer 1888.", vanGogh);
//        WorkOfArt eagleOfDelight = new WorkOfArt("Hayne Hudjihini, Eagle of Delight", "Oil on Canvas", "Inman’s portraits of Native Americans were painted in preparation for hand-colored lithographs to be made for a publication by the Head of Indian Affairs, Thomas L. McKenney—\"The History of the Indian Tribes of North America\" (1836–44). These distinguished leaders had originally been painted from life by Charles Bird King, when invited to Washington in 1822. King’s portraits were destroyed in a fire at the Smithsonian Institution in 1865. This rare portrayal of a Native American woman, Hayne Hudjihini, Eagle of Delight—wife of Sumonyeacathee, Chief of the Otoe-Missouria people—emphasizes her distinctive beauty and bearing. She is adorned with earrings, necklaces, and a silver bracelet.", inman);
//        WorkOfArt bass = new WorkOfArt("Channel Bass", "Watercolor and graphite on white wove paper", "None", homer);
//        WorkOfArt embroideredPicture = new WorkOfArt("Embroidered Picture", "Linen embroidered with wool and silk thread", "At age fourteen Mary Wright, the only child of a prosperous farmer and brickyard owner in Middletown, Connecticut, was sent to school in Newport. In the mid-eighteenth century few schools in Connecticut taught more than the basics of reading, writing, and arithmetic. In order to gain the necessary feminine accomplishments, well-to-do girls were usually sent to either Boston or Newport. While at school Mary completed at least two needlework pictures based on engravings depicting the four seasons.", wright);
//        WorkOfArt beachScene = new WorkOfArt("Beach Scene", "Watercolor and gouache on off-white wove paper", "Several American landscape artists, from Frederic E. Church to William Trost Richards to James Hamilton, garnered the honorific “American Turner,” after the visionary British master Joseph M.W. Turner, who died in 1852 just as the age of landscape painting in America was coming to fruition. Perhaps none better than the Philadelphian Hamilton earned the sobriquet for the expressionistic technical liberties he indulged after Turner’s example. Hamilton may have more conspicuously been a student of Turner’s contemporary John “Pandemonium” Martin. Martin’s streamlined stylization of terrestrial and celestial forms presages the same features in Hamilton’s work in both oil and watercolor, such as this otherworldly scene based probably on the Jersey shore at Atlantic City, which Hamilton began visiting in the 1860s.", hamilton);
//        workOfArtRepo.save(shoes);
//        workOfArtRepo.save(eagleOfDelight);
//        workOfArtRepo.save(bass);
//        workOfArtRepo.save(embroideredPicture);
//        workOfArtRepo.save(beachScene);
//
//        Activity learnProgramming = new Activity("Learn a new programming language", "Learn a different programming language and see how it relates to the one(s) you already know!");
//        Activity learnSport = new Activity("Learn how to play a new sport", "Learn how to play a different sport with either your friends or by yourself");
//        Activity teachDog = new Activity("Teach your dog a new trick", "Teach your dog a new trick and show it off to your parents");
//        Activity takeBath = new Activity("Take a bubble bath", "Take a bubble bath and relax for a while");
//        activityRepo.save(learnProgramming);
//        activityRepo.save(learnSport);
//        activityRepo.save(teachDog);
//        activityRepo.save(takeBath);

    }
}
