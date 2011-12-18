/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library.domain;

import java.io.Serializable;


/**
 *
 * @author trentonknight
 */
public class Book implements Serializable {
private String title;
private String isbn;
private String author;

public Book(){
    title = "";
    isbn = "";
    author = "";
}
public void setTitle(String title){
    this.title = title;
}
public void setIsbn(String isbn){
    this.isbn = isbn;
}
public void setAuthor(String author){
    this.author = author;
}
public String getTitle(){
    return title;
}
public String getIsbn(){
    return isbn;
}
public String getAuthor(){
    return author;
}
public String getBook() {
    return isbn + "," + title + "," + author;
  }

@Override
  public String toString() {
    return ""+getBook()+"";
  }

 

   

    
   
}
