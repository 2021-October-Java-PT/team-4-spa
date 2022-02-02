package org.wecancodeit.serverside.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.serverside.models.Meal;

public interface MealRepository extends CrudRepository<Meal, Long> {

}
