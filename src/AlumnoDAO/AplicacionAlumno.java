/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnoDAO;



/**
 *
 * @author osboxes
 */
public class AplicacionAlumno {
    public static void main(String[] args) {
       AlumnoInterface objetoDAO = FactoriaAlumnos.getAlumnoDao();
       
 
       AlumnoInterface  alumno1=objetoDAO.getNuevoAlumno("1111","Sonia Rodríguez Martín","DAM", "1234" );
    }
    
    
}
