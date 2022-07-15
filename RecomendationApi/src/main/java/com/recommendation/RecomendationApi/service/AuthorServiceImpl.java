package com.recommendation.RecomendationApi.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.recommendation.RecomendationApi.model.Author;
import com.recommendation.RecomendationApi.model.Book;
import com.recommendation.RecomendationApi.repository.AuthorRepository;

public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorRepository authorRepo;
	
	@Override
	public Author addAuthor(Author author) {
		// TODO Auto-generated method stub
		return authorRepo.save(author);
	}
	@Override
	public List<Author> getAllAuthors() {
	
		
		
		// TODO Auto-generated method stub
		return authorRepo.findAll();
		
		
	}

	@Override
	public Book getAuthorByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
//	public List<Author> getAllAuthors() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Author updateAuthor11(Integer id, AuthorRepository author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author updateAuthor1(Integer id, AuthorRepository author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author updateAuthor(Integer id, AuthorRepository author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object add(Object author) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Author getAuthorById(int authorid) {
		// TODO Auto-generated method stub
		return null;
	}

}