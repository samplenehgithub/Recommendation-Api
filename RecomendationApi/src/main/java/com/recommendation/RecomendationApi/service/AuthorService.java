package com.recommendation.RecomendationApi.service;




import java.util.List;


import com.recommendation.RecomendationApi.model.Author;
import com.recommendation.RecomendationApi.model.Book;
import com.recommendation.RecomendationApi.repository.AuthorRepository;

public interface AuthorService {

	//Author addAuthor(Integer id);
	//List<Author> getAllAuthors();
  
	Book getAuthorByName(String name);

	//List<Author> getAllAuthors();

	Author updateAuthor11(Integer id, AuthorRepository author);

	//void addAuthor(Author id);

	Author updateAuthor1(Integer id, AuthorRepository author);

	//Author addAuthor(Author author);

	Author updateAuthor(Integer id, AuthorRepository author);

	Author getEmployeeById(int eid);
     Object add(Object author);
	
	Author addAuthor(Author author);
	List<Author> getAllAuthors();

	Author getAuthorById(int authorid);





}
