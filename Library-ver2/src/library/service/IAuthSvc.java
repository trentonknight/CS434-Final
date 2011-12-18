/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;
import library.domain.Login;

/**
 *
 * @author trentonknight
 */
public interface IAuthSvc {
     public Login add(Login login);
     public Login getUser(Login login);
}
