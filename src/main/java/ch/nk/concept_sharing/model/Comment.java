package ch.nk.concept_sharing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Comment {
    private int id;
    private int postId;
    private String content;
    private int userId;
}
