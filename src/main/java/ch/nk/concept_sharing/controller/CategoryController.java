package ch.nk.concept_sharing.controller;

import ch.nk.concept_sharing.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private List<Category> categories=new ArrayList<>();

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        categories.add(category);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
