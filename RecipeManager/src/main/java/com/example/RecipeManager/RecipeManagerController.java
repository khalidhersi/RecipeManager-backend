package com.example.RecipeManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins  =  "http://localhost:3000")
public class RecipeManagerController {
@Autowired
    RecipeManagerRepository repository;

@GetMapping("/recipe-manager")
    public ResponseEntity<List<RecipeManager>> getRecipe(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
}

    @GetMapping("/recipe-manager/{id}")
    public ResponseEntity<RecipeManager> getRecipeManagerById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findRecipeManagerByid(Integer.parseInt(id)));
    }

@PostMapping("/recipe")
    public ResponseEntity<String> createRecipeManager(@RequestBody RecipeManager recipe){
    repository.save(recipe);
    return ResponseEntity.status(HttpStatus.CREATED).body(" added!" + recipe.getRecipe());
}

    @DeleteMapping("/recipe/{id}")
    @Transactional
    public ResponseEntity<String> deleteRecipe(@PathVariable String id) {
        repository.deleteRecipeManagerByid(Integer.parseInt(id));
        return ResponseEntity.status(HttpStatus.OK).body("Recipe with ID" + id + "has been deleted");
    }

}
