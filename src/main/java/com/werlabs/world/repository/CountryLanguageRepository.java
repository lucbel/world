package com.werlabs.world.repository;

import com.werlabs.world.model.CountryLanguage;
import com.werlabs.world.model.CountryLanguageId;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by rodrigo on 21/11/17.
 */
@Transactional
public interface CountryLanguageRepository extends CrudRepository<CountryLanguage,CountryLanguageId> {
}
