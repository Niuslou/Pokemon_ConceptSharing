package ch.nk.concept_sharing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Post {
    private int id;
    private String title;
    private String description;
    private int userId;
}
