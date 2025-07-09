package ch.nk.concept_sharing.service;

import ch.nk.concept_sharing.model.Like;
import ch.nk.concept_sharing.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    private final LikeRepository likeRepository;

    @Autowired
    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

    public Like createLike(Like like) {
        return likeRepository.save(like);
    }

    public Optional<Like> getLikeById(Long id) {
        return likeRepository.findById(id);
    }
}
