package com.werlabs.world.repository;

import com.werlabs.world.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rodrigo on 20/11/17.
 */
@Transactional
public interface CountryRepository extends CrudRepository<Country,String> {
}
