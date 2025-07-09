package ch.nk.concept_sharing.service;

import ch.nk.concept_sharing.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final List<Post> posts = new ArrayList<>();

    public List<Post> getAllPosts() {
        return posts;
    }

    public Post createPost(Post post) {
        posts.add(post);
        return post;
    }

    public Optional<Post> getPostById(Long id) {
        return posts.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
