package com.wipro.LibraryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.LibraryApp.model.Library;
import com.wipro.LibraryApp.repository.LibraryRepository;

@Service
public class LibraryAddServiceImpl {

	@Autowired
	LibraryRepository libraryRepository;

	public void addLibrary(Library library) {
		libraryRepository.save(library);

	}
	
	public void addLibrarywithSaveAndFlush(Library library) {
		libraryRepository.saveAndFlush(library);

	}



	public void addAllLibrary(List<Library> allLibraries) {
		libraryRepository.saveAll(allLibraries);

	}

}
