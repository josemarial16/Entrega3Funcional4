/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.sii.ejb;

import es.uma.sii.entidades.Actividad;
import es.uma.sii.entidades.Actividad_Formacion;
import es.uma.sii.entidades.Administrador;
import es.uma.sii.entidades.Alumno;
import es.uma.sii.entidades.Asignatura;
import es.uma.sii.entidades.Inscripcion_Actividad;
import es.uma.sii.entidades.Inscripcion_Actividad_Formacion;
import es.uma.sii.entidades.ONG;
import es.uma.sii.entidades.Proyecto;
import es.uma.sii.entidades.Responsable_Asignatura;
import es.uma.sii.entidades.Usuario;
import java.util.List;
import javax.ejb.Local;



/**
 *
 * @author Alejandro
 */
@Local
public interface BaseDeDatosLocal {

  //  public List<Usuario> getUsuarios2();
    public List<Usuario> getUsuarios();
    public void setUsuario(Usuario u);
    public List<ONG>getONG();
    public void modificarUsuario(Usuario u);
    public void modificarONG(ONG o);
    public void modificarActividad(Actividad a);
    public void setNuevaActividad(Actividad a);
    public void setNuevaActividadFormacion(Actividad_Formacion a);
    public List<Actividad_Formacion>getActividadesFormacion();
    public List<Actividad>getActividades();
    public void setNuevoProyecto(Proyecto p);
    public List<Proyecto>getProyectos();
    public void setNuevaInscripcion(Inscripcion_Actividad ins);
    public List<Inscripcion_Actividad> getInscripcionesActividad();
    public List<Inscripcion_Actividad_Formacion> getInscripcionesActividadFormacion();

    public void modificarInscripcion(Inscripcion_Actividad ins);
     public void modificarInscripcion_Formacion(Inscripcion_Actividad_Formacion ins);
    public void eliminarInscripcionActividad(Inscripcion_Actividad ins);
    public List<Administrador>getAdministradores();
    public void modificarActividadFormacion(Actividad_Formacion a);
    public void setNuevaONG(ONG o);
    public List<Responsable_Asignatura>getResponsableAsignatura();
    public List<Asignatura>getAsignatura();
    public void eliminarAdministrador(Administrador a);
            
}
