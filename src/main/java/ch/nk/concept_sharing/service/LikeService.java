package ch.nk.concept_sharing.service;

import ch.nk.concept_sharing.model.Like;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class LikeService {
    private final List<Like> likes = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public List<Like> getAllLikes() {
        return likes;
    }

    public Like createLike(Like like) {
        like.setId(idCounter.getAndIncrement());
        likes.add(like);
        return like;
    }

    public Optional<Like> getLikeById(Long id) {
        return likes.stream().filter(l -> l.getId().equals(id)).findFirst();
    }
}
