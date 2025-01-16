package guru.springframework.spring5_recipe_app.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@ToString(exclude = "recipes")
@EqualsAndHashCode(exclude = {"recipes"})
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
