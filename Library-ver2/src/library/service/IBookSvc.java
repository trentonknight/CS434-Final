/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;
import library.domain.*;
/**
 *
 * @author trentonknight
 */
public interface IBookSvc {
    
   public Book add(Book book);
   public Book retrieve(Book book);
   public Book search(Book book);
   public Book delete(Book book);

}
