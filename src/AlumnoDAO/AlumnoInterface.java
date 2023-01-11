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

    public interface AlumnoInterface {

// metodos GET
   public String getNumexpdte();
    public String getNombre();
    public String getCiclo();   
    public String getDni();
      
// metodos SET
    public void  setNombre(String nombre);  
    public void  setCiclo(String ciclo);            
    public void  setDni(String dni);
    //    public void  setNUMEXPDTE(String NUMEXPDTE);//ojo no se puede modificar la clave primaria con la clave primaria habrá que hacer un insert(*)
// métodos FIND
    public AlumnoInterface getAlumnoPorNUMEXPDTE(String NUMEXPDTE);
    public java.util.Collection getAlumnoPorCiclo(String ciclo);
    public java.util.Collection getAlumnoPorNombre(String nombre);
    
  // METODO BORRADO
    public void delete();
   
 //necesitamos definir un método para crear un nuevo alumno, que lo vamos a llamar desde los constructores de alumnoBean(*)
    public AlumnoInterface getNuevoAlumno(String NUMEXPDTE,String nombre,String ciclo, String dni );

}

