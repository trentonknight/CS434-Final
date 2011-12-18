/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniserver.business;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import miniserver.domain.Login;

/**
 *
 * @author trentonknight
 */
public class MutiConnectThread extends Thread {

    private Socket socket = null;
    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    
    public MutiConnectThread(Socket socket) {
        
        super("MutiConnectThread");
        this.socket = socket;
        System.out.println("Server socket is: " + socket.isConnected());
        System.out.println("Thread ID: " + super.getId());
        System.out.println("Thread name: " + super.getName());
        System.err.println("Thread priority: " + super.getPriority());
        
        if(super.getId() == 19){
            super.setPriority(2);
        System.out.println("Server socket is: " + socket.isConnected());
        System.out.println("Thread ID: " + super.getId());
        System.out.println("Thread name: " + super.getName());
        System.err.println("Thread priority: " + super.getPriority());
        }
    }

    public Login run(Login login) {

        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            out.writeObject(in);
            String name = (String) in.readObject();
            
            login.setUsername(name);
            
            
            out.close();
            in.close();
            socket.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MutiConnectThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        }
        return login;
    }
}
