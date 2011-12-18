/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniserver.business;

import java.net.*;
import java.io.*;
import miniserver.domain.Login;

/**
 *
 * @author trentonknight
 */
public class ConnectionMgr {

    /**
     * @param args the command line arguments
     */
    public Login Conn(Login login) throws IOException {
        ServerSocket server = null;
        boolean listening = true;
        try {
            InetAddress connect = InetAddress.getLocalHost();
            server = new ServerSocket(4444,100,connect);
        } catch (Exception e) {
            System.err.println("Connection failed!");
            System.exit(1);
        }
        while (listening) {
            new MutiConnectThread(server.accept()).start();
            System.out.println("server channel: " + server.getChannel()
                    + "\nserver inet address: " + server.getInetAddress()
                    + "\nserver local port: " + server.getLocalPort()
                    + "\nserver local socket address: " + server.getLocalSocketAddress());
        }


        server.close();
        System.exit(0);
        return login;
    }
}
