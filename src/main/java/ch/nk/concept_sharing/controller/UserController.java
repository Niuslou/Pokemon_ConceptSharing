package ch.nk.concept_sharing.controller;

import ch.nk.concept_sharing.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users= new ArrayList<>();

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        users.add(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
        if (id >= 0 && id < users.size()) {
            return new ResponseEntity<>(users.get(id), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
