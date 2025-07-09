package ch.nk.concept_sharing.controller;

import ch.nk.concept_sharing.model.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/posts")
public class PostController {
    private List<Post> posts = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Post>> getPosts() {
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        posts.add(post);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }

    @GetMapping("{/id}")
    public ResponseEntity<Post> getPostById(@PathVariable long id) {
        Optional<Post> post = posts.stream().filter(p -> p.getId() == id).findFirst();
        if (post.isPresent()) {
            return new ResponseEntity<>(post.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
