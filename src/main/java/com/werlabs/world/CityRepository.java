package com.werlabs.world;

import com.werlabs.world.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rodrigo on 19/11/17.
 */
@Transactional
public interface CityRepository extends CrudRepository<City,Long> {
}
