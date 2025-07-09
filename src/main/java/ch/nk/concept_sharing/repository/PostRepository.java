package ch.nk.concept_sharing.repository;

import ch.nk.concept_sharing.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
