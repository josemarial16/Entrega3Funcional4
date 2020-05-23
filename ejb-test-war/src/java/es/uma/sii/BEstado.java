/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.sii;

import es.uma.sii.ejb.BaseDeDatosLocal;
import es.uma.sii.entidades.Actividad;
import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Javi
 */
@Named("bEstado")
@SessionScoped
public class BEstado implements Serializable{
    private int estado=0;
    private Actividad a;
    private String nombre;
    private String descripcion;
    private String lugar;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String tipo_actividad;
    
    @Inject
    private BaseDeDatosLocal bd;
    public Actividad getA() {
        return a;
    }

    public void setA(Actividad a) {
        this.a = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }
            
    public BEstado(){
        
    }
    public int getEstado() {
		return this.estado;
	}
	
	public void setEstado(int estado) {
		this.estado=estado;
	}
        
       public String modificarActividad(Actividad a){
           String pagina="modificarActividad.xhtml";
           this.a=a;
                  
            return pagina;
       }
   
    public String procesarCambios(){
        String pagina="consultaractividad.xhtml";
        if(!nombre.equalsIgnoreCase("")){
            a.setNombre(nombre);
           
        }else{
            a.setNombre(a.getNombre());
        }
        if(!descripcion.equalsIgnoreCase("")){
            a.setDescripcion(descripcion);
        }else{
            a.setDescripcion(a.getDescripcion());
        }
        if(!lugar.equalsIgnoreCase("")){
            a.setLugar(lugar);
        }else{
            a.setLugar(a.getLugar());
        }
        if(fecha_inicio!=null){
            a.setFecha_inicio(fecha_inicio);
        }
        a.setEstado("pendiente de validacion");
        if(fecha_fin!=null){
            a.setFecha_fin(fecha_fin);
        }
        if(!tipo_actividad.equalsIgnoreCase("")){
            a.setTipo_Actividad(tipo_actividad);
        }else{
            a.setTipo_Actividad(a.getTipo_Actividad());
        }
        bd.modificarActividad(a);
        return pagina;

    }
}
