/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alinaalam
 */

import java.util.*;

public class Library {

    private ArrayList<Book> books;
    
    public Library() {
        books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        books.add(newBook);
        
    }
    
    public void printBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchedBooks = new ArrayList<Book>();
        for(Book book : books) {
            if(StringUtils.included(book.title(), title)) {
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searchedBooks = new ArrayList<Book>();
        for(Book book : books) {
            if(StringUtils.included(book.publisher(), publisher)) {
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searchedBooks = new ArrayList<Book>();
        for(Book book : books) {
            if(book.year() == year) {
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
}
