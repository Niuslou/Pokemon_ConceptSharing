package ch.nk.concept_sharing.repository;

import ch.nk.concept_sharing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
