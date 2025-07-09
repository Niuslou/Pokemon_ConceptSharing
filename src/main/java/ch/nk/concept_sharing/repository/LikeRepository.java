package ch.nk.concept_sharing.repository;

import ch.nk.concept_sharing.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
