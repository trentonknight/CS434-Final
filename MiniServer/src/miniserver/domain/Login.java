/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniserver.domain;
import java.io.Serializable;


/**
 *
 * @author Jason N Mansfield
 */
public class Login implements Serializable{
    //**private Strings for both**//
        private String password;
        private String username;
    //**public constructor
    public Login(){
        password = "";
        username = "";
    }
    //**public setters**//
    public void setPassword(String password){
        this.password = password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    //**public getters**//
    public String getUsername(){
       return username;
    }
    public String getPassword(){
        return password;
    }
    //**boolean test objects**//
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Login)) {
            return false;
        }
        Login log = (Login) obj;
        if(!(this.password.equals(log.password)))
        {
            return false;
        }
        if(!(this.username.equals(log.username)))
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 41 * hash + (this.username != null ? this.username.hashCode() : 0);
        return hash;
    }
    //*validate*//
     public boolean validate() {
        if (password == null || password.equals("")) {
            return false;
        }
        if (username == null || username.equals("")) {
            return false;
        }
        return true;
    }
}
