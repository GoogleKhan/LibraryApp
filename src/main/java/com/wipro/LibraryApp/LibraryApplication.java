package com.wipro.LibraryApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.LibraryApp.model.Library;
import com.wipro.LibraryApp.service.LibraryAddServiceImpl;
import com.wipro.LibraryApp.service.LibraryCountServiceImpl;
import com.wipro.LibraryApp.service.LibraryDeleteServiceImpl;
import com.wipro.LibraryApp.service.LibraryReadService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class LibraryApplication implements CommandLineRunner {

	@Autowired
	private LibraryReadService libraryReadService;

	@Autowired
	private LibraryAddServiceImpl libraryAddServiceImpl;

	@Autowired
	private LibraryCountServiceImpl libraryCountServiceImpl;
	
	@Autowired
	private LibraryDeleteServiceImpl libraryDeleteServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);

		System.out.println("Bye Bye");
	}

	@Override
	public void run(String... args) throws Exception {

//		Library library = Library.builder().id(109).name("PapaLib").commaSepratedBookNames("Banana, Apple, Orange")
//				.build();
//		libraryAddServiceImpl.addLibrary(library);
//
//		log.info("Library added successfully");
//
//		log.info("-------------------------------------------------------------------------");
//
//		Library libraryNew = Library.builder().id(112).name("SisterLib")
//				.commaSepratedBookNames("Lipstic, EyeLiner, FacePack").build();
//		libraryAddServiceImpl.addLibrarywithSaveAndFlush(libraryNew);
//		log.info("addLibrarywithSaveAndFlush added successfully");
//
//		log.info("-------------------------------------------------------------------------");
//
//		Library library1 = Library.builder().id(110).name("MummyLib")
//				.commaSepratedBookNames("Biryani, Shahi paneer, Kabab").build();
//		Library library2 = Library.builder().id(111).name("BrotherLib").commaSepratedBookNames("Watch, Cap, Chain")
//				.build();
//
//		List<Library> allLibraries = new ArrayList<Library>();
//		allLibraries.add(library1);
//		allLibraries.add(library2);
//
//		libraryAddServiceImpl.addAllLibrary(allLibraries);
//		log.info("All Libraries added successfully");
//
//		log.info("-------------------------------------------------------------------------");
//
//		List<Library> allLibrary = libraryReadService.getAllLibrary();
//		log.info("All Library data ->{}", allLibrary);
//
//		log.info("-------------------------------------------------------------------------");
//
//		List<Library> allLibraryWithNoBooks = libraryReadService.getAllLibraryWithNoBooks();
//		log.info("All Library with no Books ->{}", allLibraryWithNoBooks);
//
//		log.info("-------------------------------------------------------------------------");
//
//		List<Library> allLibraryPagination = libraryReadService.getLibrariesPaged();
//		log.info("All Library with Pagination ->{}", allLibraryPagination);
//
//		log.info("-------------------------------------------------------------------------");
//
//		List<Library> allLibraryCustomPagination = libraryReadService.getLibrariesCustomPaged(1, 3);
//		log.info("All Library with Custom Pagination ->{}", allLibraryCustomPagination);
//
//		log.info("-------------------------------------------------------------------------");
//
//		List<Library> allLibrariesWithLatestAddedOrder = libraryReadService.getLibrariesWithLatestAddedOrder();
//		log.info("All Library with Latest Added Order ->{}", allLibrariesWithLatestAddedOrder);
//
//		log.info("-------------------------------------------------------------------------");
//
//		List<Library> allLibrariesCustomSortedById = libraryReadService.getLibrariesCustomSortedById("desc");
//		log.info("All Library with Custom Order ->{}", allLibrariesCustomSortedById);
//
//		log.info("-------------------------------------------------------------------------");
//
//		long count = libraryCountServiceImpl.getLibraryCount();
//		log.info("Count of all libraries are ->{}", count);
//		
//		log.info("-------------------------------------------------------------------------");
//
////		libraryDeleteServiceImpl.pruneTable();
////		log.info("Delete All rows from table");
////		
////		log.info("-------------------------------------------------------------------------");
//
//		libraryDeleteServiceImpl.deleteAllInBatch();
//		log.info("Delete All in Batch from table");

	}

}
