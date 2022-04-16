package com.example.RecipeManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeManagerRepository extends JpaRepository<RecipeManager, String> {
    RecipeManager findRecipeManagerByid(int id);

    String deleteRecipeManagerByid(int id);

}
