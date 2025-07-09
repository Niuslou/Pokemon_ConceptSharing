package ch.nk.concept_sharing.repository;

import ch.nk.concept_sharing.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
