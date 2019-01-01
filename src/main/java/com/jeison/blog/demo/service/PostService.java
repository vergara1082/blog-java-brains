/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeison.blog.demo.service;


import com.jeison.blog.demo.entities.Post;
import com.jeison.blog.demo.repositories.PostRespository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author root
 */

@Service
public class PostService {
    
    @Autowired
    private PostRespository postRespository;
    
    public List<Post> getAllPsst(){
        
        return  postRespository.findAll();
    }

    public void insert(Post post) {
     postRespository.save(post);
    }
    
}
