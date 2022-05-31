package com.wipro.LibraryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.LibraryApp.model.Library;
import com.wipro.LibraryApp.service.LibraryAddServiceImpl;

@RestController
public class LibraryCreateController {

	@Autowired
	private LibraryAddServiceImpl libraryAddServiceImpl;

	@PostMapping("/insertOne")
	public String insertOneLibraries(Library library) {
		libraryAddServiceImpl.addLibrary(library);
		return "Success";
	}

	@PostMapping("/insertAll")
	public String insertAllLibraries(@RequestBody List<Library> allLibraries) {
		libraryAddServiceImpl.addAllLibrary(allLibraries);
		return "Success";
	}

}
