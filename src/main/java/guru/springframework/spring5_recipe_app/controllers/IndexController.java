package guru.springframework.spring5_recipe_app.controllers;

import guru.springframework.spring5_recipe_app.domain.Category;
import guru.springframework.spring5_recipe_app.domain.UnitOfMeasure;
import guru.springframework.spring5_recipe_app.repositories.CategoryRepository;
import guru.springframework.spring5_recipe_app.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> optionalCategory = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is : " + optionalCategory.get().getId());
        System.out.println("UOM Id is : " + optionalUnitOfMeasure.get().getId());
        return "index";
    }
}
