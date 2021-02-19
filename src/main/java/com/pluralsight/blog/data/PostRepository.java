package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.pluralsight.blog.model.Post;

import java.util.List;


public interface PostRepository extends JpaRepository<Post, Long> {
    @RestResource(rel = "contains-title", path = "containsTitle")
    public List<Post> findByTitleContaining(String title);
}
