package ch.nk.concept_sharing.service;

import ch.nk.concept_sharing.model.Comment;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CommentService {
    private final List<Comment> comments = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public List<Comment> getAllComments() {
        return comments;
    }

    public Comment createComment(Comment comment) {
        comment.setId(idCounter.getAndIncrement());
        comments.add(comment);
        return comment;
    }

    public Optional<Comment> getCommentById(Long id) {
        return comments.stream().filter(c -> c.getId().equals(id)).findFirst();
    }
}
