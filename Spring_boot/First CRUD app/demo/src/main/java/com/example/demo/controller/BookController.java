package com.example.demo.controller;

import com.example.demo.repository.BookRepository;
import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/getAllBooks")
    public ResponseEntity<List<Book>> getAllBooks(){
        try {
            List<Book> bookList = new ArrayList<>();
            bookRepository.findAll().forEach(bookList::add);

            if (bookList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(bookList, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/getBookById/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        Optional<Book> bookData = bookRepository.findById(id);
        if(bookData.isPresent()){
            return new ResponseEntity<>(bookData.get(), HttpStatus.OK);
        } return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book bookObj = bookRepository.save(book);

        return new  ResponseEntity<>(bookObj, HttpStatus.OK);
    }
    @PostMapping("/updateBookById/{id}")
    public ResponseEntity<Book> updateBookById(@PathVariable Long id, @RequestBody Book nextBookData){
       Optional<Book> oldbookData = bookRepository.findById(id);
       if(oldbookData.isPresent()){
        Book updatedBookData = oldbookData.get();
        updatedBookData.setTitle(nextBookData.getTitle());
        updatedBookData.setAuthor(nextBookData.getAuthor());
        Book bookObj = bookRepository.save(updatedBookData);
        return new ResponseEntity<>(bookObj, HttpStatus.OK);
       }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/deleteBookById/{id}")
    public ResponseEntity<HttpStatus> deleteBookById(@PathVariable Long id){
        bookRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}