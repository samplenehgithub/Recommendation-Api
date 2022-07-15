package com.recommendation.RecomendationApi.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	// @org.springframework.beans.factory.annotation.Autowired(required=true)
import com.recommendation.RecomendationApi.model.Author;

import com.recommendation.RecomendationApi.service.AuthorService;

	@RestController
	@RequestMapping("/author")
	//@CrossOrigin(origins = "*")

  public class AuthorController {

		@Autowired
		AuthorService authorService;

		private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	// http://localhost:9999/author/get-all-author
		@GetMapping("/getAllAuthor")
		public ResponseEntity<List<Author>> getAllAuthor() {
			List<Author> authors = authorService.getAllAuthors();
			if(authors == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(authors));
			}
		// http://localhost:9999/author/get-author-by-id/{authorid}
		@GetMapping("/get-author-by-authorid/{authorid}")
		public ResponseEntity<Author> getAuthorById(@PathVariable(name = "authorid") int authorid) {
			LOG.info(Integer.toString(authorid));
			Author dep = authorService.getAuthorById(authorid);
			HttpStatus status = HttpStatus.OK;
			ResponseEntity<Author> response = new ResponseEntity<>(dep, status);
			return response;
		}

		
	}