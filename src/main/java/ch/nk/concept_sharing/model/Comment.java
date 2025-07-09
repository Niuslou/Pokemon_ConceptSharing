package ch.nk.concept_sharing.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comment {
    @Id @GeneratedValue
    private Long id;
    private String content;

    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;
}
