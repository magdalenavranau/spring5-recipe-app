package guru.springframework.spring5_recipe_app.services;

import guru.springframework.spring5_recipe_app.commands.RecipeCommand;
import guru.springframework.spring5_recipe_app.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
