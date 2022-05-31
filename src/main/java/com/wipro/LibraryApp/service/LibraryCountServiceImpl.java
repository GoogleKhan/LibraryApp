package com.wipro.LibraryApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.LibraryApp.repository.LibraryRepository;

@Service
public class LibraryCountServiceImpl {

	@Autowired
	LibraryRepository libraryRepository;

	public long getLibraryCount() {
		return libraryRepository.count();

	}

	public long getLibraryCountWithNoBooks() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
