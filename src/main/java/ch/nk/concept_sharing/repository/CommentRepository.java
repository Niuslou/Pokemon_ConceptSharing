package ch.nk.concept_sharing.repository;

import ch.nk.concept_sharing.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
