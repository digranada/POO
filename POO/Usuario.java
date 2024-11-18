/******************************************************************************
UNIVERSIDAD DE LAS FUERZAS ARMADAS - ESPE
DEPARTAMENTO DE CIENCIAS DE LA COMPUTACION
ASIGNATURA: PROGRAMACION ORIENTADO A OBJETOS
DOCENTE: MGTR LUIS ENRIQUE JARAMILLO MONTAÑO
ALUMNO: DAVID IVAN GRANADA PACHACAMA

Ejercicio: Crear 5 objetos
*******************************************************************************/
public class Usuario
{
	public static void main(String[] args) {
		//Creando primer Objeto
		Administrador adm=new Administrador();
		adm.nombreAdmin="David Granada";
		adm.email="digranada@espe.edu.ec";
		adm.actualizarCatalogo();
		//Creando segundo Objeto
		Administrador adm2=new Administrador();
		adm2.nombreAdmin="Diana Lopez";
		adm2.email="dilopez@espe.edu.ec";
		adm2.actualizarCatalogo();
		//Creando tercer Objeto
		Administrador adm3=new Administrador();
		adm3.nombreAdmin="Santiago Tenorio";
		adm3.email="srtenorio@espe.edu.ec";
		adm3.actualizarCatalogo();
		//Creando cuarto Objeto
		Cliente cln=new Cliente();
		cln.nombreCliente="Maria Remache";
		cln.direccion="Sangolqui";
		cln.email="maremache@espe.edu.ec";
	    cln.saldoCuenta=780;
		cln.registro();
		//Creando quinto Objeto
		Cliente cln2=new Cliente();
		cln2.nombreCliente="Anita Hidalgo";
		cln2.direccion="Quito";
		cln2.email="aehidalgo@espe.edu.ec";
	    cln2.saldoCuenta=1025;
		cln2.registro();
		
		
	}
}
