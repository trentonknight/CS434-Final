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

    public class IAuthSvcSerializedImpl implements IAuthSvc {
//*serializing
    public Login add(Login login){
        try{
        FileOutputStream fos = new FileOutputStream("login.txt");
        ObjectOutputStream output = new ObjectOutputStream(fos);
        System.out.println(login.toString());
        output.writeObject(login);  
        output.flush();
        output.close();
        }catch(Exception e){
            System.out.print("Falure to write!");
      }
        return login;
    
    }

    public Login getUser(Login login) {
        try{
            login = null;
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("login.txt"));
            login = (Login)input.readObject(); 
            input.close();
        }catch(Exception e){
            System.out.print("Falure to read!");
        }
        return login;
    }
}
