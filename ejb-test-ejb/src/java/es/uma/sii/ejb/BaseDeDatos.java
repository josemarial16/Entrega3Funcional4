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
import es.uma.sii.entidades.PDI;
import es.uma.sii.entidades.Proyecto;
import es.uma.sii.entidades.Responsable_Asignatura;
import es.uma.sii.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


/**
 *
 * @author Alejandro
 */
@Stateless
public class BaseDeDatos implements BaseDeDatosLocal {
    
    @PersistenceContext(unitName = "ejb-test-ejbPU")
    private EntityManager em;
    
    
  /*  public List<Usuario> getUsuarios2() {
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("javi", "123", "ALUMNO","745151445","Javier","Merino","javiermerino@hotmail.com",Usuario.Preferencias.VOLUNTARIADO));
        usuarios.add(new Usuario("Luis", "SII", "PDI","454156454","Luis","Sanchez","luisan@gmail.com",Usuario.Preferencias.INVESTIGACION));
        usuarios.add(new Usuario("Jose Maria", "nomegustanada", "ADMINISTRADOR","5465456","José María","Luque","chema@hotmail.com",Usuario.Preferencias.NINGUNA));
        usuarios.add(new Usuario("Antonio", "antonio123", "ADMINISTRADOR","2154545","Antonio","Priego","antonio@uma.es",Usuario.Preferencias.NINGUNA));
        usuarios.add(new Usuario("Pepita", "megustalospapeles", "PAS","1456455","Josefa","Garcia","pepi@uma.com",Usuario.Preferencias.VOLUNTARIADO));
        
        return usuarios;
    }*/
    
    public List<Usuario> getUsuarios() {
        Query query = em.createQuery("select a from Usuario a");
        return query.getResultList();
    }
    public void setUsuario(Usuario u){
        if(u.getTipo_usuario().equalsIgnoreCase("administrador")){
            Administrador admin=new Administrador(u);
            em.persist(admin);
        }else if(u.getTipo_usuario().equalsIgnoreCase("alumno")){
            Alumno al=new Alumno(u);
            em.persist(al);
        }else if(u.getTipo_usuario().equalsIgnoreCase("pdi")){
            PDI pdi=new PDI(u);
            em.persist(pdi);
        }else if(u.getTipo_usuario().equalsIgnoreCase("pas")){
            em.persist(u);
        }
        
    }
    public List<ONG>getONG(){
       Query query = em.createQuery("select a from ONG a");
        return query.getResultList();
    }
     public List<Asignatura>getAsignatura(){
       Query query = em.createQuery("select a from Asignatura a");
        return query.getResultList();
    }
    public List<Administrador>getAdministradores(){
       Query query = em.createQuery("select a from Administrador a");
        return query.getResultList();
    }
    public void modificarUsuario(Usuario u){
     em.merge(u);
     
    }  
   public void modificarONG(ONG o){
     em.merge(o);
    
    }  
   public void setNuevaActividad(Actividad a){
           em.persist(a);

       }
   
    public void setNuevaActividadFormacion(Actividad_Formacion a){
           em.persist(a);

       }
    public void setNuevaONG(ONG o){
           em.persist(o);

       }
     public List<Actividad>getActividades(){
       Query query = em.createQuery("select a from Actividad a");
        return query.getResultList();
    }
     public List<Actividad_Formacion>getActividadesFormacion(){ //DUDA AQUI
       Query query  = em.createQuery("select a from Actividad_Formacion a where type(a)=Actividad_Formacion");
    
      
        return query.getResultList();
    }
     public List<Responsable_Asignatura>getResponsableAsignatura(){ //DUDA AQUI
       Query query  = em.createQuery("select a from Usuario a where type(a)=Responsable_Asignatura");
    
      
        return query.getResultList();
    }
       public void setNuevoProyecto(Proyecto p){
           em.persist(p);

       }
       public void modificarActividad(Actividad a){
           em.merge(a);
       }
       public void modificarActividadFormacion(Actividad_Formacion a){
           em.merge(a);
       }
       public List<Proyecto>getProyectos(){
           Query query = em.createQuery("select a from Proyecto a");
        return query.getResultList();
       }
       public void setNuevaInscripcion(Inscripcion_Actividad ins){
           if(ins.getActividad().getTipo_Actividad().equalsIgnoreCase("formacion")){
               Inscripcion_Actividad_Formacion insf=new Inscripcion_Actividad_Formacion(ins);
               em.persist(insf);
           }else{
               em.persist(ins);
           }
       }
        public List<Inscripcion_Actividad> getInscripcionesActividad(){
            Query query = em.createQuery("select a from Inscripcion_Actividad a");
        return query.getResultList();
        }
       public void modificarInscripcion(Inscripcion_Actividad ins){
           em.merge(ins);
       }
        public void modificarInscripcion_Formacion(Inscripcion_Actividad_Formacion ins){
           em.merge(ins);
       }
       public void eliminarInscripcionActividad(Inscripcion_Actividad ins){
           em.remove(em.merge(ins));
       }

}

