package com.demo.LibraryManagement.Repository;

import com.demo.LibraryManagement.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface LibraryRepository extends JpaRepository<Books,Integer> {
}


