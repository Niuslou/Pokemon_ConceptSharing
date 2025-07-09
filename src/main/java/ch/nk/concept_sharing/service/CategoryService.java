package ch.nk.concept_sharing.service;

import ch.nk.concept_sharing.model.Category;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CategoryService {
    private final List<Category> categories = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public List<Category> getAllCategories() {
        return categories;
    }

    public Category createCategory(Category category) {
        category.setId(idCounter.getAndIncrement());
        categories.add(category);
        return category;
    }

    public Optional<Category> getCategoryById(Long id) {
        return categories.stream().filter(c -> c.getId().equals(id)).findFirst();
    }
}
