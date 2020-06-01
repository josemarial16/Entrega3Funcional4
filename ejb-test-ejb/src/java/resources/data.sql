/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  usuario
 * Created: 01-jun-2020
 */

insert into APP.USUARIO (DNI,DTYPE,ACTIVIDAD_PREFERENTE,APELLIDOS,CONTRASEÑA,EMAIL,NOMBRE,TIPO_USUARIO,USUARIO_ACCESO,ASIGNATURA_CODIGO) values('12345678H','R','investigacion','Bujalance','123','luis@uma.es','Luis','PDI','luis1',1)
insert into APP.USUARIO (DNI,DTYPE,ACTIVIDAD_PREFERENTE,APELLIDOS,CONTRASEÑA,EMAIL,NOMBRE,TIPO_USUARIO,USUARIO_ACCESO) values('87654321J','A','formacion','Martinez','123','alfonsito@uma.es','Alfonso','Alumno','alfonso1')
insert into APP.USUARIO (DNI,DTYPE,APELLIDOS,CONTRASEÑA,EMAIL,NOMBRE,TIPO_USUARIO,USUARIO_ACCESO) values('12121212K','Admin','Algo','123','roberto@adminuma.es','Roberto','Administrador','rober1')
insert into APP.USUARIO (DNI,DTYPE,APELLIDOS,CONTRASEÑA,EMAIL,NOMBRE,TIPO_USUARIO,USUARIO_ACCESO) values('13131313P','Admin','Casas','123','casas@adminuma.es','Carlos','Administrador','casas1')
insert into APP.USUARIO (DNI,DTYPE,ACTIVIDAD_PREFERENTE,APELLIDOS,CONTRASEÑA,EMAIL,NOMBRE,TIPO_USUARIO,USUARIO_ACCESO,ASIGNATURA_CODIGO) values('45678912M','R','investigacion','Ramirez','123','ramirez@uma.es','Alejandro','PDI','ramirez1',2)
insert into APP.USUARIO (DNI,DTYPE,ACTIVIDAD_PREFERENTE,APELLIDOS,CONTRASEÑA,EMAIL,NOMBRE,TIPO_USUARIO,USUARIO_ACCESO) values('45633217Q','Usuario','voluntariado','Lopez','123','lopez@uma.es','Juan','PAS','lopez1')
insert into APP.USUARIO (DNI,DTYPE,ACTIVIDAD_PREFERENTE,APELLIDOS,CONTRASEÑA,EMAIL,NOMBRE,TIPO_USUARIO,USUARIO_ACCESO,ASIGNATURA_CODIGO) values('9865423P','A','formacion','perez','123','perez@uma.es','Fernando','Alumno','perez1',1)
insert into APP.ALUMNO_ASIGNATURA (ALUMNO_FK,ASIGNATURA_FK) values('87654321J',1)
insert into APP.ALUMNO_ASIGNATURA (ALUMNO_FK,ASIGNATURA_FK) values('9865423P',2)
insert into APP.ACTIVIDAD (IDENTIFICADOR,DTYPE,DESCRIPCION,ESTADO,FECHA_FIN,FECHA_INICIO,LUGAR,NOMBRE,TIPO_ACTIVIDAD,ONG_IDENTIFICADOR) values(123456,'F','Aprender a medicar a los mas desfavorecidos','Pendiente de validacion',date(2020-01-02),date(2020-01-03),'Montilla','Aprender a curar','formacion',619894204)
insert into APP.ONG (IDENTIFICADOR,CONTRASEÑA,EMAIL,ESTADO_REGISTRO,NOMBRE,PERSONA_CONTACTO,TELEFONO,USUARIO_ACCESO) values(619894204,'123','merino@uma.es','aceptada','Manos Unidas','Javier Merino',655456323,'unidasPodemos1')
insert into APP.PDI_ASIGNATURA(ASIGNATURA_FK,PDI_FK) values (1,'12345678H') 
insert into APP.ASIGNATURA(CODIGO,DEPARTAMENTO,NOMBRE) values(1,'Medicina General','Efectos de la medicina')
insert into APP.ASIGNATURA(CODIGO,DEPARTAMENTO,NOMBRE) values(2,'Medicina General','Radioterapia')