/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.business;
import library.domain.*;
import library.service.Factory;
import library.service.IBookSvc;

/**
 *
 * @author trentonknight
 */
public class BookMgr{
    public Book createBook(Book book) throws Exception
    { 
    Factory factory = new Factory();
    IBookSvc bookSvc = (IBookSvc)factory.getService("IBookSvc");
    return bookSvc.add(book);
    }
    public Book retBook(Book book) throws Exception
    {
    Factory factory = new Factory();
    IBookSvc bookSvc = (IBookSvc) factory.getService("IBookSvc");
    book = bookSvc.retrieve(book);
    return book;
    }
    public Book searchBook(Book book) throws Exception
    {
    Factory factory = new Factory();
    IBookSvc bookSvc = (IBookSvc) factory.getService("IBookSvc");
    book = bookSvc.search(book);
    return book;
    }
    public Book delBook(Book book) throws Exception
    {
    Factory factory = new Factory();
    IBookSvc bookSvc = (IBookSvc) factory.getService("IBookSvc");
    book = bookSvc.delete(book);
    return book;
    }
    
}
