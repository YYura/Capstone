package com.example.capstone.repository;

import com.example.capstone.data.ItemClassify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemClassifyRepository extends JpaRepository<ItemClassify, String> {

}
