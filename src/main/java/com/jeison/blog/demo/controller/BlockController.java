/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeison.blog.demo.controller;



import com.jeison.blog.demo.entities.Post;
import com.jeison.blog.demo.service.PostService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */

@RestController
public class BlockController {
    
    @Autowired
    private PostService postService;
    
    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }
    
    @GetMapping(value = "/posts")
    public List<Post> getAllpost(){
        return postService.getAllPsst();
    }
    
    @PostMapping(value = "/post")
    public void publishPost(@RequestBody Post post){
        if (post.getDate() ==  null) {
            post.setDate(new Date());
        }
        postService.insert(post);
    }
    
}
