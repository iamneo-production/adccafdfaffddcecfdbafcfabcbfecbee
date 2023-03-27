package com.example.springapp.Services;

import java.util.List;
import java.util.Optional;

import com.example.springapp.Models.Review;
import com.example.springapp.Repositories.ReviewRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class ReviewService {
    @Autowired
    ReviewRepo rr;
    
    public List<Review> GetAll(){
        return rr.findAll();
    }
    public String Postss(Review r1)
    {
        rr.save(r1);
        return "posted";
    }
    public Page<Review> GetWithsize(int size)
    {
        Pageable pageable = Pageable.ofSize(size);
        return rr.findAll(pageable);
    }
    public Optional<Review> GetWithField(int id)
    {
        return rr.findById(id);
    }
}
