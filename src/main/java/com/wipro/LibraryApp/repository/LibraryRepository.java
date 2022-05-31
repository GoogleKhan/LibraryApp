package com.wipro.LibraryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.LibraryApp.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Long>{

	
}
