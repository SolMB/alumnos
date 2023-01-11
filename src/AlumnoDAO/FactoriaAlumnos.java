/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnoDAO;

import AlumnoDAO.AlumnoInterface;
import AlumnoDAO.AlumnoBean;

/**
 *
 * @author osboxes
 */
public class FactoriaAlumnos {
    // metodo estatico que devuelve un obj alumnointerfaz
     
  public static  AlumnoInterface getAlumnoDao(){
      
        return new AlumnoBean();
    }
}
