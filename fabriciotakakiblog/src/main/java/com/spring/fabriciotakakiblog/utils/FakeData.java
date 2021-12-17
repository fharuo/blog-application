package com.spring.fabriciotakakiblog.utils;

import com.spring.fabriciotakakiblog.model.Post;
import com.spring.fabriciotakakiblog.repository.FabricioTakakiBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class FakeData {

    @Autowired
    FabricioTakakiBlogRepository fabricioTakakiBlogRepository;

//    @PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Fabrício Takaki");
        post1.setData(LocalDate.now());
        post1.setTitulo("Primeiro Post do Blog");
        post1.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        Post post2 = new Post();
        post2.setAutor("Fabrício Takaki");
        post2.setData(LocalDate.now());
        post2.setTitulo("Segundo Post do Blog");
        post2.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        postList.add(post1);
        postList.add(post2);

    }
}
