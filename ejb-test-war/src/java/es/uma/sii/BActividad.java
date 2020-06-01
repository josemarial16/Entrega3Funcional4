package es.uma.sii;

import es.uma.sii.ejb.BaseDeDatosLocal;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

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
import es.uma.sii.entidades.Usuario.Preferencias;
import es.uma.sii.entidades.Usuario.Rol;
import java.util.Arrays;
import java.util.Objects;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named("bActividad")
@RequestScoped

public class BActividad {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.username);
        hash = 23 * hash + Objects.hashCode(this.nombre_actividad);
        hash = 23 * hash + Objects.hashCode(this.descripcion);
        hash = 23 * hash + Objects.hashCode(this.lugar);
        hash = 23 * hash + Objects.hashCode(this.tipo_actividad);
        hash = 23 * hash + Objects.hashCode(this.fechaInicio);
        hash = 23 * hash + Objects.hashCode(this.fechaFin);
        hash = 23 * hash + this.estado;
        hash = 23 * hash + Objects.hashCode(this.r);
        hash = 23 * hash + Objects.hashCode(this.lgn);
        hash = 23 * hash + Objects.hashCode(this.actividades);
        hash = 23 * hash + Objects.hashCode(this.usuarios);
        hash = 23 * hash + Objects.hashCode(this.responsable_asignatura);
        hash = 23 * hash + Objects.hashCode(this.inscripciones_actividad_formacion);
        hash = 23 * hash + Objects.hashCode(this.proyectos);

        hash = 23 * hash + Objects.hashCode(this.inscripciones_actividades);
        hash = 23 * hash + Objects.hashCode(this.ONGs);
        hash = 23 * hash + Objects.hashCode(this.ctrl);
        hash = 23 * hash + Objects.hashCode(this.bd);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BActividad other = (BActividad) obj;
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.nombre_actividad, other.nombre_actividad)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.lugar, other.lugar)) {
            return false;
        }
        if (!Objects.equals(this.tipo_actividad, other.tipo_actividad)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaFin, other.fechaFin)) {
            return false;
        }
        if (!Objects.equals(this.r, other.r)) {
            return false;
        }
        if (!Objects.equals(this.lgn, other.lgn)) {
            return false;
        }
        if (!Objects.equals(this.actividades, other.actividades)) {
            return false;
        }
        if (!Objects.equals(this.usuarios, other.usuarios)) {
            return false;
        }
        if (!Objects.equals(this.responsable_asignatura, other.responsable_asignatura)) {
            return false;
        }
        if (!Objects.equals(this.inscripciones_actividad_formacion, other.inscripciones_actividad_formacion)) {
            return false;
        }
        if (!Objects.equals(this.proyectos, other.proyectos)) {
            return false;
        }
       
        if (!Objects.equals(this.inscripciones_actividades, other.inscripciones_actividades)) {
            return false;
        }
        if (!Objects.equals(this.ONGs, other.ONGs)) {
            return false;
        }
        if (!Objects.equals(this.ctrl, other.ctrl)) {
            return false;
        }
        if (!Objects.equals(this.bd, other.bd)) {
            return false;
        }
        return true;
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }
     public String getDescripcion() {
        return descripcion;
    }
     public String getLugar() {
        return lugar;
    }
      public Date getFechaInicio() {
        return fechaInicio;
    }
      public Date getFechaFin() {
        return fechaFin;
    }
    
            public String getTipoActividad() {
        return tipo_actividad;
    }
    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }

    public List<Inscripcion_Actividad_Formacion> getInscripciones_actividad_formacion() {
        return inscripciones_actividad_formacion;
    }

    public void setInscripciones_actividad_formacion(List<Inscripcion_Actividad_Formacion> inscripciones_actividad_formacion) {
        this.inscripciones_actividad_formacion = inscripciones_actividad_formacion;
    }

   
 
	private String username;
        private String nombre_actividad;
        private String descripcion;
        private String lugar;
        private String tipo_actividad;
        private Date fechaInicio;
        private Date fechaFin;
        
        private String nombre_Proyecto;

    public String getNombre_Proyecto() {
        return nombre_Proyecto;
    }

    public void setNombre_Proyecto(String nombre_Proyecto) {
        this.nombre_Proyecto = nombre_Proyecto;
    }

    public String getDescripcion_Proyecto() {
        return descripcion_Proyecto;
    }

    public void setDescripcion_Proyecto(String descripcion_Proyecto) {
        this.descripcion_Proyecto = descripcion_Proyecto;
    }

    public String getTipo_Proyecto() {
        return tipo_Proyecto;
    }

    public void setTipo_Proyecto(String tipo_Proyecto) {
        this.tipo_Proyecto = tipo_Proyecto;
    }
 /*   public String procesarProyecto(){
        String pagina="nuevoproyecto.xhtml";
        Proyecto p=new Proyecto(r.nextLong(),this.nombre_Proyecto,"Pendiente de aprobacion",this.descripcion_Proyecto,this.tipo_Proyecto,,ctrl.getUsuario());
        bd.setNuevoProyecto(p);
        return pagina;
    }*/
    
        private String descripcion_Proyecto;
        private String tipo_Proyecto;
        private Actividad a;
        
	private int estado=0;
        private Random r=new Random();
	private Login lgn;
        private String responAsig;

    public String getResponAsig() {
        return responAsig;
    }

    public void setResponAsig(String responAsig) {
        this.responAsig = responAsig;
    }
	private List<Actividad>actividades;
	private List<Usuario>usuarios;
	private Responsable_Asignatura responsable_asignatura;
	private List<Inscripcion_Actividad_Formacion>inscripciones_actividad_formacion;
	private List<Proyecto>proyectos;
        private String[]actividadesFormacionSeleccionadas;
	private List<Actividad_Formacion> actividades_formacionDisponibles;
	private List<Inscripcion_Actividad>inscripciones_actividades;
        private List<Actividad>actividadesElegir;
        private String[]actividadesElegidas;
        private int valoracion_actividad;
        private int horas;
        private int valoracionONG;
        private String comentarioONG;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getValoracionONG() {
        return valoracionONG;
    }

    public void setValoracionONG(int valoracionONG) {
        this.valoracionONG = valoracionONG;
    }

    public String getComentarioONG() {
        return comentarioONG;
    }

    public void setComentarioONG(String comentarioONG) {
        this.comentarioONG = comentarioONG;
    }
        private List<Responsable_Asignatura>responsableAsignaturaElegir;

    public List<Responsable_Asignatura> getResponsableAsignaturaElegir() {
        return bd.getResponsableAsignatura();
    }

    public void setResponsableAsignaturaElegir(List<Responsable_Asignatura> responsableAsignaturaElegir) {
        this.responsableAsignaturaElegir = responsableAsignaturaElegir;
    }
        private double notaProfesor;
        private String comentarioProfesor;

        public String evaluarAlumno(Inscripcion_Actividad ins){
            String pagina="evaluaralumnos.xhtml";
            Inscripcion_Actividad_Formacion insf=new Inscripcion_Actividad_Formacion(ins);
            insf.setEstado_Inscripcion("terminada");
            insf.setNota(notaProfesor);
            insf.setComentario_Profesor(comentarioProfesor);
            bd.modificarInscripcion(insf);
            return pagina;
        }
        
    public double getNotaProfesor() {
        return notaProfesor;
    }

    public void setNotaProfesor(double notaProfesor) {
        this.notaProfesor = notaProfesor;
    }

    public String getComentarioProfesor() {
        return comentarioProfesor;
    }
    public String valorarUsuariosONG(Inscripcion_Actividad ins){
        ins.setNumero_Horas_Realizadas(this.horas);
        ins.setValoracion_ONG(this.valoracionONG);
        ins.setRazon_ONG(this.comentarioONG);
        bd.modificarInscripcion(ins);
        return "valorarusuariosONG.xhtml";
    }
    public void setComentarioProfesor(String comentarioProfesor) {
        this.comentarioProfesor = comentarioProfesor;
    }

    public int getValoracion_actividad() {
        return valoracion_actividad;
    }

    public void setValoracion_actividad(int valoracion_actividad) {
        this.valoracion_actividad = valoracion_actividad;
    }

    public String getComentario_actividad() {
        return comentario_actividad;
    }
    

    public void setComentario_actividad(String comentario_actividad) {
        this.comentario_actividad = comentario_actividad;
    }
    
        private String comentario_actividad;
        
        public String enviarValoracionInscripcion(Actividad act,Usuario u){
            String pagina="actividades.xhtml";
            for(Inscripcion_Actividad ins:bd.getInscripcionesActividad()){
                if(ins.getActividad().getIdentificador()==act.getIdentificador() && ins.getUsuario().getDNI().equals(u.getDNI())){
                    ins.setValoracion_Usuario(valoracion_actividad);
                    ins.setRazon_Usuario(comentario_actividad);
                    bd.modificarActividad(act);
                    bd.modificarInscripcion(ins);
                }
            }
            return pagina;
        }
        public String eliminarInscripcion(Actividad act,Usuario u){
            String pagina="actividades.xhtml";
            for(Inscripcion_Actividad ins:bd.getInscripcionesActividad()){
                if(ins.getActividad().getIdentificador()==act.getIdentificador() && ins.getUsuario().getDNI().equals(u.getDNI())){
                    
                    bd.eliminarInscripcionActividad(ins);
                }
            }
            return pagina;
        }

        public String getActividadesFormacionSeleccionadasInString(){
            return Arrays.toString(actividadesFormacionSeleccionadas);
        }
        public String[] getActividadesFormacionSeleccionadas(){
            return actividadesFormacionSeleccionadas;
        }
    public String[] getActividadesElegidas() {
        return actividadesElegidas;
    }

    public void setActividadesElegidas(String[] actividadesElegidas) {
        this.actividadesElegidas = actividadesElegidas;
    }
	private List<ONG>ONGs;
        @Inject
        private ControlAutorizacion ctrl;
        @Inject
        private BaseDeDatosLocal bd;
	public BActividad() {
        
           
       
  
		
	}
        public List<Actividad_Formacion> getActividadesElegir(){
            List<Actividad_Formacion>actvs=new ArrayList<Actividad_Formacion>();
		for(Actividad_Formacion a:bd.getActividadesFormacion()) {
                    if(a.getRespon_asig()!=null){
                       if(a.getRespon_asig().getDNI().equals(ctrl.getUsuario().getDNI())) {
				actvs.add(a);
                        } 
                    }
			
			
		}
		return actvs;
        }
     
       
        public String aceptarActividadFormacion(Actividad_Formacion a){
            String pagina="validaractividad.xhtml";
            a.setEstado("En proceso de inscripcion");
            bd.modificarActividadFormacion(a);
            return pagina;
        }
        public String rechazarActividadFormacion(Actividad_Formacion a){
            String pagina="validaractividad.xhtml";
            a.setEstado("Rechazada");
            bd.modificarActividadFormacion(a);
            return pagina;
        }
         public String rechazarActividadFormacionAdministrador(Actividad_Formacion a){
            String pagina="solicitudesactividadesformacion.xhtml";
            a.setEstado("Rechazada");
            bd.modificarActividadFormacion(a);
            return pagina;
        }
        public String rechazarActividad(Actividad a){
            
            a.setEstado("Rechazada");
            bd.modificarActividad(a);
            return "solicitudesactividades.xhtml";
        }
        public void setNombreActividad(String nombre){
            this.nombre_actividad=nombre;
        }
        public void setDescripcion(String descripcion){
            this.descripcion=descripcion;
        }
        public void setLugar(String lugar){
            this.lugar=lugar;
        }
        public void setTipoActividad(String tipo){
            this.tipo_actividad=tipo;
        }
        public void setFechaInicio(Date fecha){
            this.fechaInicio=fecha;
        }
        public void setFechaFin(Date fecha){
            this.fechaFin=fecha;
        }
 
       public List <Actividad_Formacion> getActividades_formacionDisponibles(){
           
            return actividades_formacionDisponibles;
        }
       
       public void setActividades_formacionDisponibles(List<Actividad_Formacion>a){
    
           this.actividades_formacionDisponibles=a;
           
       }
     
        public void setActividadesFormacionSeleccionadas(String[]formacionselec){
            this.actividadesFormacionSeleccionadas=formacionselec;
        }
   
       /*public void setActividadesFormacion(String[] af){
           this.actividades_formacionS=af;
       }*/
       
        public String procesarActividad(){
            String pagina="nuevaactividad.xhtml";
             FacesContext ctx = FacesContext.getCurrentInstance();
            if(this.nombre_actividad!=null && this.descripcion!=null && this.lugar!=null && this.fechaInicio!=null && this.fechaFin!=null && this.tipo_actividad!=null){
                if(this.tipo_actividad.equalsIgnoreCase("formacion")){
                     Actividad a=new Actividad((r.nextLong() % (0-2000))+20000 ,this.nombre_actividad,this.descripcion,this.lugar,"Pendiente de validacion",this.fechaInicio,this.fechaFin,this.tipo_actividad,ctrl.getONG());
                    Actividad_Formacion af=new Actividad_Formacion(a);
                    bd.setNuevaActividadFormacion(af);
                     ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Actividad creada correctamente", ""));
                }else{
                    Actividad a=new Actividad((r.nextLong() % (0-20000))+20000 ,this.nombre_actividad,this.descripcion,this.lugar,"Pendiente de validacion",this.fechaInicio,this.fechaFin,this.tipo_actividad,ctrl.getONG());
                    bd.setNuevaActividad(a);
    	            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Actividad creada correctamente", ""));
                }
                   
            } else{
                  ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, rellena todos los campos", ""));

            }
            return pagina;
         
        }
        public List<Actividad> convertirAList(){
            List<Actividad> a=new ArrayList<>();
        
            for(int i=0;i<actividadesFormacionSeleccionadas.length;i++){
              for(Actividad ac:bd.getActividades()){
                  if(ac.getNombre().equalsIgnoreCase(actividadesFormacionSeleccionadas[i])){
                      a.add(ac);
                  }
              }  
                
            }
          
            return a;
        }
       
        public String procesarProyecto(){
            FacesContext ctx = FacesContext.getCurrentInstance();
            String pagina="solicitarproyectos.xhtml";
            long id=r.nextLong();
            Proyecto p=new Proyecto(id,this.nombre_Proyecto,"pendiente de validacion",this.descripcion_Proyecto,this.tipo_Proyecto,convertirAList(),null);
            bd.setNuevoProyecto(p);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Proyecto creado correctamente", ""));
            for(Actividad a:convertirAList()){
                a.setProyecto(p);
                bd.modificarActividad(a);
            }
            return pagina;
        }
	public Responsable_Asignatura getResponsable_asignatura() {
		return responsable_asignatura;
	}
	public void setResponsable_asignatura(Responsable_Asignatura responsable_asignatura) {
		this.responsable_asignatura = responsable_asignatura;
	}
	public List<Proyecto> getProyectos() {
		return proyectos=bd.getProyectos();
	}
	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	public List<ONG> getONGs() {
		return bd.getONG();
	}
	public void setONGs(List<ONG> oNGs) {
		ONGs = oNGs;
	}
	public Login getLgn() {
		return lgn;
	}
	public void setLgn(Login lgn) {
		this.lgn = lgn;
	}
	
	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Inscripcion_Actividad> getInscripciones_actividades() {
		return inscripciones_actividades;
	}
	
	public List<Actividad> obtenerListaActividadPorUsuario(Usuario usuario){
		List<Actividad> actvs=new ArrayList<Actividad>();
		for(Inscripcion_Actividad ins:bd.getInscripcionesActividad()) {
			if(ins.getUsuario().getDNI().equals(usuario.getDNI())) {
				actvs.add(ins.getActividad());
			}
		}
		return actvs;
	}
        
        public Actividad_Formacion esFormacion(Actividad a){
            List<Actividad_Formacion> listAf=bd.getActividadesFormacion();
            Actividad_Formacion act=null;
            boolean encontrado=false;
            int cont=0;
            while(!encontrado && cont<listAf.size()){
                if(listAf.get(cont).getIdentificador()==a.getIdentificador()){
                    act=listAf.get(cont);
                    encontrado=true;
                }else{
                    cont++;
                }
            }
            return act;
        }
        
        public boolean estaMatriculado(Usuario u,Actividad_Formacion af){
            boolean esta=false;
            Asignatura ac=af.getAsignatura();
            for(Asignatura a:bd.getAsignatura()){
                if(a.getCodigo()==ac.getCodigo()){
                    for(Alumno alu:a.getAlumnosInscritos()){
                        if(u.getDNI().equals(alu.getDNI())){
                            esta=true;
                        }
                    }
                }
            }
            return esta;
        }
        
        public String procesarInscripcion(Long id){
            String pagina="buscaractividades.xhtml";
            FacesContext ctx = FacesContext.getCurrentInstance();
            for(Actividad a:bd.getActividades()){
                if(a.getIdentificador()==id){
                    Actividad_Formacion af=esFormacion(a);
                    if(af!=null){
                        if(estaMatriculado(ctrl.getUsuario(),af)){
                            Inscripcion_Actividad ins=new Inscripcion_Actividad(r.nextLong(),"Pendiente de validacion PDI",-1,"",-1,"",-1,a,ctrl.getUsuario());
                            bd.setNuevaInscripcion(ins);
                            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Inscripcion en actividad creada correctamente", ""));
                           }else{
                            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No estas matriculado de la asignatura a la que pertenece esa actividad", ""));

                        }
                    }else{
                        Inscripcion_Actividad ins=new Inscripcion_Actividad(r.nextLong(),"Pendiente de validacion ONG",-1,"",-1,"",-1,a,ctrl.getUsuario());
                        bd.setNuevaInscripcion(ins);
                        ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Inscripcion en actividad creada correctamente", ""));
                    }
                    
               
                    }
            }
           
            return pagina;
        }
	
	public void setInscripciones_actividades(List<Inscripcion_Actividad> inscripciones_actividades) {
		this.inscripciones_actividades = inscripciones_actividades;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		
	
		return username;
	}
	
	public int getEstado() {
		return this.estado;
	}
	
	public void setEstado(int estado) {
		this.estado=estado;
	}
	public int numeroActividades(String username) {
		int cont=0;
		for(Inscripcion_Actividad i:inscripciones_actividades) {
			if(username.equals(i.getUsuario().getUsuario_Acceso())) {
				cont++;
			}
		}
		return cont;
	}
	
	public List<Inscripcion_Actividad> obtenerListaInscripcionPorUsuario(Usuario usuario){
		List<Inscripcion_Actividad> actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad ins:bd.getInscripcionesActividad()) {
			if(ins.getUsuario().getDNI().equals(usuario.getDNI())) {
				actvs.add(ins);
			}
		}
		return actvs;
	}
        public List<Inscripcion_Actividad_Formacion> obtenerListaInscripcionFormacionPorUsuario(Usuario usuario){
		List<Inscripcion_Actividad_Formacion> actvs=new ArrayList<Inscripcion_Actividad_Formacion>();
		for(Inscripcion_Actividad_Formacion ins:bd.getInscripcionesActividadFormacion()) {
			if(ins.getUsuario().getDNI().equals(usuario.getDNI())) {
				actvs.add(ins);
			}
		}
		return actvs;
	}
	
	public List<Actividad> obtenerListaActividadesPorRol(Usuario usuario){
		List<Actividad>actvs=new ArrayList<Actividad>();
		if(usuario.getTipo_usuario().equalsIgnoreCase("PDI")) {
			for(Actividad a:bd.getActividades()){
                           if(!a.getTipo_Actividad().equalsIgnoreCase("Formacion")) {
                               
                               int cont =0;
                               boolean encontrada =false;
                               List<Inscripcion_Actividad> ins = bd.getInscripcionesActividad();
                               while(!encontrada && cont<ins.size()){
                                  if(ins.get(cont).getUsuario().getDNI().equals(usuario.getDNI())){
                                    if(ins.get(cont).getActividad().getIdentificador()==a.getIdentificador()){
                                        encontrada=true;
                                    }
                                  }
                                  cont++;
                               }
                               
                               if(!encontrada){
                                   actvs.add(a);
                               }
                            
                           }
                    }
		}else if(usuario.getTipo_usuario().equalsIgnoreCase("PAS")) {
			for(Actividad a:bd.getActividades()){
                           if(a.getTipo_Actividad().equalsIgnoreCase("Voluntariado")) {
                               
                               int cont =0;
                               boolean encontrada =false;
                               List<Inscripcion_Actividad> ins = bd.getInscripcionesActividad();
                               while(!encontrada && cont<ins.size()){
                                  if(ins.get(cont).getUsuario().getDNI().equals(usuario.getDNI())){
                                    if(ins.get(cont).getActividad().getIdentificador()==a.getIdentificador()){
                                        encontrada=true;
                                    }
                                  }
                                  cont++;
                               }
                               
                               if(!encontrada){
                                   actvs.add(a);
                               }
                            
                           }
                    }
		}else if(usuario.getTipo_usuario().equalsIgnoreCase("ALUMNO")) {
                   
			for(Actividad a:bd.getActividades()){
                           if(!a.getTipo_Actividad().equalsIgnoreCase("Investigacion")) {
                               
                               int cont =0;
                               boolean encontrada =false;
                               List<Inscripcion_Actividad> ins = bd.getInscripcionesActividad();
                               while(!encontrada && cont<ins.size()){
                                  if(ins.get(cont).getUsuario().getDNI().equals(usuario.getDNI())){
                                    if(ins.get(cont).getActividad().getIdentificador()==a.getIdentificador()){
                                        encontrada=true;
                                    }
                                  }
                                  cont++;
                               }
                               
                               if(!encontrada){
                                   actvs.add(a);
                               }
                            
                           }
                    }
                }
    		return actvs;
	
        }
	public int numeroActividadesTotales() {
		int cont=0;
		for(Inscripcion_Actividad i:inscripciones_actividades) {
			cont++;
		}
		return cont;
	}
	
	public List<Actividad> obtenerListaActividadesPorPreferencia(Usuario usuario){
		List<Actividad>actvs=new ArrayList<Actividad>();
		for(Actividad a:bd.getActividades()){
                           if(a.getTipo_Actividad().equalsIgnoreCase(usuario.getActividad_Preferente())) {
                               
                               int cont =0;
                               boolean encontrada =false;
                               List<Inscripcion_Actividad> ins = bd.getInscripcionesActividad();
                               while(!encontrada && cont<ins.size()){
                                  if(ins.get(cont).getUsuario().getDNI().equals(usuario.getDNI())){
                                    if(ins.get(cont).getActividad().getIdentificador()==a.getIdentificador()){
                                        encontrada=true;
                                    }
                                  }
                                  cont++;
                               }
                               
                               if(!encontrada){
                                   actvs.add(a);
                               }
                            
                           }
                    }
		return actvs;
	}
	
	public List<Actividad>obtenerActividadRecomendadas(Usuario usuario){
		Random r=new Random();
                int indice=r.nextInt(bd.getActividades().size()-1);
                List<Actividad>actvs=new ArrayList<Actividad>();
                for(Inscripcion_Actividad ins:bd.getInscripcionesActividad()){
                    if(bd.getActividades().get(indice).getIdentificador()!=ins.getActividad().getIdentificador()){
                        actvs.add(bd.getActividades().get(indice));
                    }else{
                        if(!bd.getActividades().isEmpty()){
                            indice=r.nextInt(bd.getActividades().size()-1);
                             if(bd.getActividades().get(indice).getIdentificador()!=ins.getActividad().getIdentificador()){
                                actvs.add(bd.getActividades().get(indice));
                    }
                        }
                    }
                }
		return actvs;
	}
	
	public List<Actividad_Formacion>obtenerActividadAValidar(Usuario usuario){ //DUDA AQUI
		List<Actividad_Formacion>actvs=new ArrayList<Actividad_Formacion>();
		for(Actividad_Formacion a:bd.getActividadesFormacion()) {
                    if(a.getRespon_asig()!=null){
                       if(a.getEstado().equalsIgnoreCase("Pendiente de validacion por responsable de asignatura") && a.getRespon_asig().getDNI().equals(usuario.getDNI())) {
				actvs.add(a);
                        } 
                    }
			
			
		}
		return actvs;
	}
        
	public List<Inscripcion_Actividad>obtenerSolicitudesAlumnosPDI(Usuario usuario){
		List<Inscripcion_Actividad>actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad a:bd.getInscripcionesActividad()) {
			if(a.getActividad().getTipo_Actividad().equalsIgnoreCase("formacion") && a.getEstado_Inscripcion().equalsIgnoreCase("Pendiente de validacion PDI")) {
                            
				actvs.add(a);
			}
		}
		return actvs;
	}
        public String validarSolicitudAlumnoPDI(Inscripcion_Actividad ins){
            String pagina="validarsolicitudalumnos.xhtml";
            ins.setEstado_Inscripcion("Validada");
            bd.modificarInscripcion(ins);
            return pagina;
        }
          public String rechazarSolicitudAlumnoPDI(Inscripcion_Actividad ins){
            String pagina="validarsolicitudalumnos.xhtml";
            ins.setEstado_Inscripcion("rechazada");
            bd.modificarInscripcion(ins);
            return pagina;
        }
	public List<Inscripcion_Actividad>obtenerListaEvaluarAlumnos(Usuario usuario){
		List<Inscripcion_Actividad>actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad a:bd.getInscripcionesActividad()) {
			if(a.getActividad().getTipo_Actividad().equalsIgnoreCase("formacion") && a.getActividad().getEstado().equalsIgnoreCase("Finalizada")) {
                            
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Actividad>obtenerSolicitudesActividades(){
		List<Actividad>actvs=new ArrayList<Actividad>();
		for(Actividad a:bd.getActividades()) {
                    
			if(!a.getTipo_Actividad().equalsIgnoreCase("formacion") && a.getEstado().equalsIgnoreCase("Pendiente de validacion")) {
				actvs.add(a);
			}
		}
		return actvs;
	}
        public List<Actividad_Formacion>obtenerSolicitudesActividadesFormacion(){
		List<Actividad_Formacion>actvs=new ArrayList<Actividad_Formacion>();
		for(Actividad_Formacion a:bd.getActividadesFormacion()) {
                    
			if(a.getEstado().equalsIgnoreCase("Pendiente de validacion")) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
        public Responsable_Asignatura encontrarResponsable(){
            Responsable_Asignatura ra=new Responsable_Asignatura();
            for(Responsable_Asignatura r:bd.getResponsableAsignatura()){
                if(r.getNombre().equals(this.responAsig)){
                    ra=r;
                }
            }
            return ra;
        }
        
        public String validarActividad(Actividad a){
            a.setEstado("En proceso de inscripcion");
            bd.modificarActividad(a);
            return "solicitudactividades.xhtml";
        }
         public String validarActividadFormacion(Actividad_Formacion a){
            a.setEstado("Pendiente de validacion por responsable de asignatura");
            a.setAsignatura(encontrarResponsable().getAsignatura());
            a.setRespon_asig(encontrarResponsable());
            bd.modificarActividadFormacion(a);
            return "solicitudactividadesformacion.xhtml";
        }
	
	public List<Administrador>obtenerAdministradores(){
		
		return bd.getAdministradores();
	}
	
	public List<Actividad>obtenerActividadesDeONG(ONG ong){
		List<Actividad>actvs=new ArrayList<Actividad>();
		for(Actividad a:bd.getActividades()) {
			if(a.getONG().getIdentificador()==ong.getIdentificador()) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Inscripcion_Actividad>obtenerSolicitudesAlumnosONG(ONG ong){
		List<Inscripcion_Actividad>actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad a: bd.getInscripcionesActividad()) {
			if(a.getActividad().getONG().getUsuario_Acceso().equalsIgnoreCase(ong.getUsuario_Acceso()) && a.getEstado_Inscripcion().equals("Pendiente de validacion ONG")) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
        public String aceptarSolicitudUsuario(Inscripcion_Actividad ins){
            ins.setEstado_Inscripcion("validada");
            bd.modificarInscripcion(ins);
            return "solicitudespendientesONG.xhtml";
        }
         public String rechazarSolicitudUsuario(Inscripcion_Actividad ins){
            ins.setEstado_Inscripcion("rechazada");
            bd.modificarInscripcion(ins);
            return "solicitudespendientesONG.xhtml";
        }
	public List<Inscripcion_Actividad>obtenerInscripcionesActividad(Actividad act){
		List<Inscripcion_Actividad>actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad a: bd.getInscripcionesActividad()) {
			if(a.getActividad().getIdentificador().equals(act.getIdentificador())) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Actividad>obtenerActividadesDeONGEnCurso(ONG ong){
		List<Actividad>actvs=new ArrayList<Actividad>();
		for(Actividad a:bd.getActividades()) {
			if(!a.getEstado().equalsIgnoreCase("Pendiente de validacion") && a.getONG().getUsuario_Acceso().equals(ong.getUsuario_Acceso())) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	public List<Inscripcion_Actividad>obtenerInscripcionesActividadPendientesValorar(ONG ong){
		List<Inscripcion_Actividad>actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad a: bd.getInscripcionesActividad()) {
			if((a.getActividad().getONG().getIdentificador()==ong.getIdentificador()) && (a.getEstado_Inscripcion().equalsIgnoreCase("Pendiente de valoracion"))) {
				actvs.add(a);
			}
		}
		return actvs;
	}
        public String eliminarAdministrador(Administrador a){
            bd.eliminarAdministrador(a);
            
            return "listadministradores.xhtml";
        }
}
