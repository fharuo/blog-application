package com.spring.fabriciotakakiblog.service;

import com.spring.fabriciotakakiblog.model.Post;

import java.util.List;

public interface FabricioTakakiBlogService {

    List<Post> findAll();

    Post findById(long id);

    Post save(Post post);
}
