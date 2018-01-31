package com.gmail.myyujinn.repositories;

import com.gmail.myyujinn.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
