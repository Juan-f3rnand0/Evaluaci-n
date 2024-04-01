
public class Estudiante extends Persona{

	int estado;

	public Estudiante(String nombre, String direccion, String telefono, String email, int estado) {
		super(nombre, direccion, telefono, email);
		this.estado = estado;
	}

	void Registrar() {
		System.out.println("Registrando el aprendiz");
	}
	
	void Modificar(){
		System.out.println("Modificando el aprendiz");
	}
	
	void Eliminar(){
		System.out.println("Modificando el aprendiz");
	}
	
	void Consultar(){
		System.out.println("Modificando el aprendiz");
	}
}
	/*public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Estudiante [estado=" + estado + ", getEstado()=" + getEstado() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + ", getEmail()="
				+ getEmail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}*/


