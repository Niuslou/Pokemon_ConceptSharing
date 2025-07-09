package ch.nk.concept_sharing.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
