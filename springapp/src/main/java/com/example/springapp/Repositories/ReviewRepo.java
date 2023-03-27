package com.example.springapp.Repositories;

import com.example.springapp.Models.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReviewRepo extends JpaRepository<Review,Integer>,PagingAndSortingRepository<Review,Integer>{
    
}
