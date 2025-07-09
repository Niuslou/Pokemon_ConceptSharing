package ch.nk.concept_sharing.controller;

import ch.nk.concept_sharing.model.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/likes")
public class LikeController {
    @Autowired
    private List<Like> likes = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Like> addLike(@RequestBody Like like) {
        likes.add(like);
        return new ResponseEntity<>(like, HttpStatus.CREATED);
    }

    @GetMapping("{/id}")
    public ResponseEntity<Like> getLike(@PathVariable Long id) {
        for (Like like : likes) {
            if (like.getId() == id) {
                return new ResponseEntity<>(like, HttpStatus.OK);
            }
            return new ResponseEntity<>(like, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
