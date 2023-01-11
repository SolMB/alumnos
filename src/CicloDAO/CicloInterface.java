/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CicloDAO;

/**
 *
 * @author osboxes
 */
public interface CicloInterface {
    // metodos de ciclo
     public CicloInterface getNuevoCiclo(String codciclo,String descripcion,String  grado);
    
     public String getCodCiclo();
     public String getDescripcion();
     public String getGrado();
     
     public void  setDescripcion(String descripcion);
     public void  setGrado(String grado);
       
}
