
public abstract class Persona {
		
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	
	
	public Persona(String nombre, String direccion, String telefono, String email) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email
				+ "]";
	}

	abstract void Registrar();
	abstract void Modificar();
	abstract void Eliminar();
	abstract void Consultar();
	
	}
	
	
	

