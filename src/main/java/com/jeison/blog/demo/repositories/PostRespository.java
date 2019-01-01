/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeison.blog.demo.repositories;


import com.jeison.blog.demo.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author root
 */
public interface PostRespository extends JpaRepository<Post,Long>{
    
}
