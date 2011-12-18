/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.domain.Login;

/**
 *
 * @author trentonknight
 */
public class IAuthSvcSocketImpl implements IAuthSvc {

    //ObjectInputStream in = null;
    ObjectOutputStream out = null;

    public Login add(Login login) {
        try {
            Socket socket = null;
           
            InetAddress connect = InetAddress.getLocalHost();
            socket = new Socket(connect, 4444);
            System.out.println("Socket connection is: " + socket.isConnected());
            //input
            BufferedReader in = new BufferedReader(
				    new InputStreamReader(
				    socket.getInputStream()));
            System.out.println(in.toString());
            //output
            out = new ObjectOutputStream(socket.getOutputStream());
            //write to object
            out.writeObject(login.getUsername());
            out.writeObject(login.getPassword());
            //close everything
            in.close();
            out.close();
            socket.close();
               
            
            return login;
        } catch (IOException ex) {
            Logger.getLogger(IAuthSvcSocketImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return login;
    }

    public Login getUser(Login login) {
        Socket socket = null;
        ObjectInputStream in = null;
        try {
            InetAddress connect = InetAddress.getLocalHost();
            socket = new Socket(connect, 4444);
            System.out.println("socket channel: " + socket.getChannel()
                    + "\nsocket inet address: " + socket.getInetAddress()
                    + "\nsocket get input stream: " + socket.getInputStream()
                    + "\nsocket local address: " + socket.getLocalAddress()
                    + "\nsocket local port: " + socket.getLocalPort()
                    + "\nsocket local socket address: " + socket.getLocalSocketAddress()
                    + "\nsocket get output stream: " + socket.getOutputStream()
                    + "\nsocket get port: " + socket.getPort()
                    + "\nsocket get recieved buffer size: " + socket.getReceiveBufferSize()
                    + "\nsocket get remote socket address: " + socket.getRemoteSocketAddress());

       in = new ObjectInputStream(socket.getInputStream());
       login = (Login)in.readObject(); 
       
        } catch (Exception e) {
            // log the error
            System.out.println("Exception " + e.getMessage());
        } finally {
            try {
                in.close();
                socket.close();
            } catch (Exception e) {
                // log the error
                System.out.println("Exception " + e.getMessage());
            }
        }
        return login;
    }
}
