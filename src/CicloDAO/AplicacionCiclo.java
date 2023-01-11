/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CicloDAO;

import CicloDAO.FactoriaCiclos;
import CicloDAO.CicloInterface;

/**
 *
 * @author osboxes
 */
public class AplicacionCiclo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
 
     CicloInterface objetoDAO = FactoriaCiclos.getCicloDao();
        
 
       CicloInterface  ciclo1=objetoDAO.getNuevoCiclo("ARI","Administración de Recursos Integrales","SUPERIOR" );
    }
    
}
