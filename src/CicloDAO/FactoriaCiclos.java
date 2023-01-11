/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CicloDAO;

import CicloDAO.CicloInterface;
import CicloDAO.CicloBean;

/**
 *
 * @author osboxes
 */
public class FactoriaCiclos {
    public static CicloInterface getCicloDao(){
    
        
        return new CicloBean();
    }
    
}
