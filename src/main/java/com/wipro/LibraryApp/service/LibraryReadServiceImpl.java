package com.wipro.LibraryApp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.wipro.LibraryApp.model.Library;
import com.wipro.LibraryApp.repository.LibraryRepository;

@Service
public class LibraryReadServiceImpl implements LibraryReadService {

	@Autowired
	LibraryRepository libraryRepository;

	public List<Library> getAllLibrary() {
		return libraryRepository.findAll();
	}

	public List<Library> getAllLibraryWithNoBooks() {

		Library library = Library.builder().commaSepratedBookNames("").build();

		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("commaSepratedBookNames", ExampleMatcher.GenericPropertyMatcher.of(StringMatcher.EXACT))
				.withIgnorePaths("id", "name");

		Example<Library> example = Example.of(library, exampleMatcher);

		return libraryRepository.findAll(example);
	}

	@Override
	public List<Library> getLibrariesPaged() {

		PageRequest pageRequest = PageRequest.of(0, 2);

		Page<Library> pages = libraryRepository.findAll(pageRequest);

		List<Library> allPageWiseLibrary = pages.get().collect(Collectors.toList());

		return allPageWiseLibrary;
	}

	@Override
	public List<Library> getLibrariesCustomPaged(int pageNum, int noOfRecordsOnPage) {

		PageRequest pageRequest = PageRequest.of(pageNum, noOfRecordsOnPage);

		Page<Library> pages = libraryRepository.findAll(pageRequest);

		List<Library> allPageWiseLibrary = pages.get().collect(Collectors.toList());

		return allPageWiseLibrary;
	}

	@Override
	public List<Library> getLibrariesWithLatestAddedOrder() {

		Sort sort = Sort.by(Order.desc("id"));
		return libraryRepository.findAll(sort);
	}

	@Override
	public List<Library> getLibrariesCustomSortedById(String ascORdesc) {

		Sort sort = null;
		if ("asc".equals(ascORdesc)) {
			sort = Sort.by(Order.asc("id"));
		} else {
			sort = Sort.by(Order.desc("id"));
		}
		return libraryRepository.findAll(sort);
	}

}
