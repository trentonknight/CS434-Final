/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;
import java.io.*;
import java.util.*;

/**
 *
 * @author trentonknight
 */
public class Factory {

   
   
   public IBookSvc getService(String serviceName) throws Exception {
        Class c = Class.forName(getImplName(serviceName));
        return (IBookSvc) c.newInstance();
    }
   private String getImplName(String serviceName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("properties.txt");
        Properties props = new Properties();
        props.load(fis);
        fis.close();
        return props.getProperty(serviceName);
    }
   
    public IAuthSvc getAuthSvc() {
        return (IAuthSvc) new IAuthSvcSocketImpl();
    }
     public IBookSvc getBookSvc(){
        return new IBookSvcSerializedImpl();
    }
    public SelectionOfSvc selServices(){
        return new ISelectSvcImpl();
    }
}
