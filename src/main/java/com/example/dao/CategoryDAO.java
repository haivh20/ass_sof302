package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.*;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
