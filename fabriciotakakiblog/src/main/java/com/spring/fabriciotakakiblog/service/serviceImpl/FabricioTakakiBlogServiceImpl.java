package com.spring.fabriciotakakiblog.service.serviceImpl;

import com.spring.fabriciotakakiblog.model.Post;
import com.spring.fabriciotakakiblog.repository.FabricioTakakiBlogRepository;
import com.spring.fabriciotakakiblog.service.FabricioTakakiBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FabricioTakakiBlogServiceImpl implements FabricioTakakiBlogService {

    @Autowired
    FabricioTakakiBlogRepository fabricioTakakiBlogRepository;

    @Override
    public List<Post> findAll() {
        return fabricioTakakiBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        Optional<Post> postFound =  fabricioTakakiBlogRepository.findById(id);

        return postFound.orElse(null);
    }

    @Override
    public Post save(Post post) {
        return fabricioTakakiBlogRepository.save(post);
    }
}
