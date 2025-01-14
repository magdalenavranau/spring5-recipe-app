package guru.springframework.spring5_recipe_app.repositories;

import guru.springframework.spring5_recipe_app.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
