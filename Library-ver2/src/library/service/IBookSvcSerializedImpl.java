/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;
import java.io.*;
import library.domain.*;

/**
 *
 * @author trentonknight
 */
public class IBookSvcSerializedImpl implements IBookSvc {
//*serializing
    public Book add(Book book){
        try{
        FileOutputStream fos = new FileOutputStream("stream.txt");
        ObjectOutputStream output = new ObjectOutputStream(fos);
        System.out.println(book.toString());
        output.writeObject(book);  
        output.flush();
        output.close();
        }catch(Exception e){
            System.out.print("Falure to write!");
      }
        return book;
    }
//*deserializing
    public Book retrieve(Book book){
        
        try{
            book = null;
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("stream.txt"));
            book = (Book)input.readObject(); 
            input.close();
        }catch(Exception e){
            System.out.print("Falure to read!");
        }
        return book;

    }

    public Book search(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Book delete(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
