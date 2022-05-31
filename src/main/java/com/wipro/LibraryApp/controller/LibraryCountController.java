package com.wipro.LibraryApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.LibraryApp.service.LibraryCountServiceImpl;
import com.wipro.LibraryApp.service.LibraryReadService;

@RestController
public class LibraryCountController {

	@Autowired
	private LibraryCountServiceImpl libraryCountServiceImpl;
	
	@Autowired
	private LibraryReadService libraryReadService;

//	@RequestMapping(value = "/getCount", method = RequestMethod.GET)
	@GetMapping("/getCount")
	public long getLibraryCount() {

		return libraryCountServiceImpl.getLibraryCount();

	}
	@GetMapping("/getCountForNoBooks")
	public long getLibraryCountWithNoBooks() {

		return libraryReadService.getAllLibraryWithNoBooks().size();

	}

}
