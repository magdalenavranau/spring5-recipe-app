package guru.springframework.spring5_recipe_app.services;


import guru.springframework.spring5_recipe_app.commands.IngredientCommand;

/**
 * Created by jt on 6/27/17.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}