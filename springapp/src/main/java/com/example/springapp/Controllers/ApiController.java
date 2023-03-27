package com.example.springapp.Controllers;

import java.util.List;

import com.example.springapp.Models.Review;
import com.example.springapp.Services.ReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    ReviewService rs;

    @GetMapping("/review")
    public List<Review> Get(){
        return rs.GetAll();
    }
    @PostMapping("/")
    public String PostIt(@RequestBody Review r1)
    {
        rs.Postss(r1);
        return "...";
    }
    @GetMapping("/{size}")
    public Page<Review> GetWithPage(@PathVariable("offset") int offset)
    {
        return rs.GetWithsize(offset);
    }
}
