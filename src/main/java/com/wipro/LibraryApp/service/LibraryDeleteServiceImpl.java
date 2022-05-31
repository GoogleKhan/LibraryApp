package com.wipro.LibraryApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.LibraryApp.repository.LibraryRepository;

@Service
public class LibraryDeleteServiceImpl {

	@Autowired
	LibraryRepository libraryRepository;

	public void pruneTable() {
		 libraryRepository.deleteAll();

	}
	public void deleteAllInBatch() {
		 libraryRepository.deleteAllInBatch();

	}
	

}
