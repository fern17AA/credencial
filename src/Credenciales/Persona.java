package Credenciales;

public class Persona {

	private int claveElectoralP;
	private String nombrePersona;
	private String apellidoPPersona;
	private String apellidoMPersona;
	private String domicilio;
	private String curp;
	private int diaNacimiento;
	private int mesNacimiento;
	private int anioNacimiento;
	private String sexo;
	private int anioRegistroINE;
	private int estado;
	private int localidad;
	private int municipio;
	private int emision;
	private int seccion;
	private int vigencia;
	

	public int getClaveElectoralP() {
		return claveElectoralP;
	}

	public void setClaveElectoralP(int claveElectoralP) {
		this.claveElectoralP = claveElectoralP;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellidoPPersona() {
		return apellidoPPersona;
	}

	public void setApellidoPPersona(String apellidoPPersona) {
		this.apellidoPPersona = apellidoPPersona;
	}

	public String getApellidoMPersona() {
		return apellidoMPersona;
	}

	public void setApellidoMPersona(String apellidoMPersona) {
		this.apellidoMPersona = apellidoMPersona;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	public int getDiaNacimiento() {
		return diaNacimiento;
	}

	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}
	
	public int getMesNacimiento() {
		return mesNacimiento;
	}

	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}
	
	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAñoNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getAnioRegistroINE() {
		return anioRegistroINE;
	}
	
	public void setAñoRegistroINE(int anioRegistroINE) {
		this.anioRegistroINE = anioRegistroINE;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public int getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}
	
	public int getMunicipio() {
		return municipio;
	}
	
	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}
	
	public int getEmision() {
		return emision;
	}
	
	public void setEmision(int emision) {
		this.emision = emision;
	}
	
	public int getSeccion() {
		return seccion;
	}
	
	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}
	
	public int getVigencia() {
		return vigencia;
	}
	
	public void setVigencia(int vigencia) {
		this.vigencia = vigencia;
	}


	public String toString() {
		return "Persona ( INSTITUTO NACIONAL ELECTORAL"
				+ "\n ApellidoPPersona: " + apellidoPPersona         + " DiaNacimiento: " + diaNacimiento  + " MesNacimiento: " + mesNacimiento + " AñoNacimiento: " + anioNacimiento
				+ "\n ApellidoMPersona: " + apellidoMPersona             + " Sexo: " + sexo
				+ "\n NombrePersona: " + nombrePersona
				+ "\n Domicilio: " + domicilio 
				+ "\n ClaveElectoralP: " + claveElectoralP 
				+ "\n Curp: " + curp + " AñoRegistroINE: " + anioRegistroINE 
				+ "\n Estado: " + estado + " Municipio: " + municipio + " Seccion: " + seccion
				+ "\n Localidad: " + localidad + " Emision: " + emision + " Vigencia: " + vigencia + "\n )";
	}

}
