package com.demo.LibraryManagement.Service;

import com.demo.LibraryManagement.Entity.Books;
import com.demo.LibraryManagement.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements AppInterface{

    private LibraryRepository libraryRepository;

    @Autowired
    public BookServiceImplementation(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Books> getBookList(){
        return libraryRepository.findAll();
    }
}
