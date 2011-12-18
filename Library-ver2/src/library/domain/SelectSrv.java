/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library.domain;

import java.io.Serializable;

/**
 *
 * @author trentonknight
 */
public class SelectSrv implements Serializable{
    public String chooseSrv;
    
    public SelectSrv(){
        chooseSrv = "";
    }
    public void setSrv(String chooseSrv){
        this.chooseSrv = chooseSrv;
    }
    
}
