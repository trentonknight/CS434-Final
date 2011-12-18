/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.domain.*;

/**
 *
 * @author trentonknight
 */
public class ISelectSvcImpl implements SelectionOfSvc {

    public SelectSrv changeService(SelectSrv sel) {
        try {
            FileOutputStream out = new FileOutputStream("properties.txt");
            PrintStream pout = new PrintStream(out);
            System.out.println(sel.chooseSrv.toString());
            pout.println(sel.chooseSrv);
        } catch (Exception e) {
            System.out.print("Falure to write!");
        }

        return sel;
    }

    
}
