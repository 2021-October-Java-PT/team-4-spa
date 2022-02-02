package org.wecancodeit.serverside.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.serverside.models.Meal;
import org.wecancodeit.serverside.repositories.MealRepository;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class MealController {

    @Resource
    private MealRepository mealRepo;

    @GetMapping("/api/meals")
    public Collection<Meal> getMeals(){
        return (Collection<Meal>) mealRepo.findAll();
    }

//    @GetMapping("/api/meals/{mealId}"){
//        public Meal getMeal(@PathVariable Long mealId){
//            return mealRepo.findById(mealId).get();
//        }
//    }


}
