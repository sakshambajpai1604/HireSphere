package com.saksham.joblisting.repository;

import com.saksham.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}