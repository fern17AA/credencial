package Credenciales;

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		BasedeDatos d = new BasedeDatos();
		Persona p = new Persona();
		Scanner sc = new Scanner(System.in);
		SecureRandom rand = new SecureRandom();

		do {

			System.out.println("Credencial, dar doble click para generar los resultados:\n" +"*************************************** \n" + "* 1) Crear registro Credencial        *\n" + "*                                     *\n" + "*                                     *\n" + "* 2) Visualizar credencial            *\n" + "***************************************");
			int ans = sc.nextInt();

			if (ans == 1) {
				// CREAR CUENTA
				p.setClaveElectoralP(rand.nextInt(2000));
				
				System.out.println("Nombre:");
				p.setNombrePersona(sc.next());
				
				System.out.println("Ape pat:");
				p.setApellidoPPersona(sc.next());
				
				System.out.println("Ape mat:");
				p.setApellidoMPersona(sc.next());
				
				System.out.println("Domicilio:");
				p.setDomicilio(sc.next());
				
				System.out.println("Curp:");
				p.setCurp(sc.next());
				
				System.out.println("DiaNacimiento:");
				p.setDiaNacimiento(sc.nextInt());
				
				System.out.println("MesNacimiento:");
				p.setMesNacimiento(sc.nextInt());
				
				System.out.println("AñoNacimiento:");
				p.setAñoNacimiento(sc.nextInt());
				
				System.out.println("Sexo:");
				p.setSexo(sc.next());
				
				System.out.println("AñoRegistroINE:");
				p.setAñoRegistroINE(sc.nextInt());
				
				System.out.println("Estado:");
				p.setEstado(sc.nextInt());
				
				System.out.println("Localidad:");
				p.setLocalidad(sc.nextInt());
				
				System.out.println("Municipio:");
				p.setMunicipio(sc.nextInt());
				
				System.out.println("Emision:");
				p.setEmision(sc.nextInt());
				
				System.out.println("Seccion:");
				p.setSeccion(sc.nextInt());
				
				System.out.println("Vigencia:");
				p.setVigencia(sc.nextInt());
				
				d.insertarRegistro(p);
				System.out.println(p);
			} 
			
			else if (ans == 2) {
				//Consultar Los Datos de la credencial
				System.out.println("Ingresa tu ClaveElectoralP:");
				p.setClaveElectoralP(sc.nextInt());
				p = d.seleccionarPersona(p);
				System.out.println(p);
			} 

		}

		while (true);


	}

}
