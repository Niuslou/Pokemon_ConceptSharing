package ch.nk.concept_sharing.controller;

import ch.nk.concept_sharing.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private List<Comment> comments = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        comments.add(comment);
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @GetMapping("{/id}")
    public ResponseEntity<Comment> getComment(@PathVariable Long id) {
        Optional<Comment> comment = comments.stream().filter(c -> c.getId() == id).findFirst();
        if (comment.isPresent()) {
            return new ResponseEntity<>(comment.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}
