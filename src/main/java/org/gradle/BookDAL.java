package org.gradle;


import java.util.Collections;
import java.util.List;
/**
* API layer for persisting and retrieving the Book objects.
*/
public class BookDAL {

  private static BookDAL bookDAL = new BookDAL();

  public List<Book> getAllBooks(){
      return Collections.emptyList();
  }
/*
 * Public String method
 * @param isbn
 * @return String
 */
  public String getBook(String isbn){
      return isbn;
  }

  public String addBook(Book book){
      return book.getIsbn();
  }

  public String updateBook(Book book){
      return book.getIsbn();
  }

  public static BookDAL getInstance(){
      return bookDAL;
  }
}