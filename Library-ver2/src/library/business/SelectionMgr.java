/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.business;

import library.domain.SelectSrv;
import library.service.*;

/**
 *
 * @author trentonknight
 */
public class SelectionMgr {
    
    public SelectSrv chooseSrv(SelectSrv sel){
     Factory factory = new Factory();   
     SelectionOfSvc selSrv = factory.selServices();
     return selSrv.changeService(sel);
    }
    
}
