/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.business;

import library.domain.Login;
import library.service.Factory;
import library.service.IAuthSvc; 

/**
 *
 * @author trentonknight
 */
public class AuthenticationMgr {

    public Login createUser(Login login) {
        Factory factory = new Factory();
        IAuthSvc loginSvc = factory.getAuthSvc();
        return loginSvc.add(login);
    }
    public Login findUser(Login login){
        Factory factory = new Factory();
        IAuthSvc loginSvc = factory.getAuthSvc();
        login = loginSvc.getUser(login);
        return login;
    }
}
