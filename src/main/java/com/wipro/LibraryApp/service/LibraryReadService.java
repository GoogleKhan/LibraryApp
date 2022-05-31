package com.wipro.LibraryApp.service;

import java.util.List;

import com.wipro.LibraryApp.model.Library;

public interface LibraryReadService {

	List<Library> getAllLibrary();

	List<Library> getAllLibraryWithNoBooks();

	List<Library> getLibrariesPaged();

	List<Library> getLibrariesCustomPaged(int pageNum, int noOfRecordsOnPage);

	List<Library> getLibrariesWithLatestAddedOrder();

	List<Library> getLibrariesCustomSortedById(String ascORdesc);

}
