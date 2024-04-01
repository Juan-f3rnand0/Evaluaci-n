
public class Empleado extends Persona{

	String departamento;
	float salario;
	String FechaContratacion;
	
	
	
	public Empleado(String nombre, String direccion, String telefono, String email, String departamento, float salario,
			String fechaContratacion) {
		super(nombre, direccion, telefono, email);
		this.departamento = departamento;
		this.salario = salario;
		FechaContratacion = fechaContratacion;
	}
	
	void Registrar() {
		System.out.println("Registrando el empleado");
	}
	
	void Modificar(){
		System.out.println("Modificando el empleado");
	}
	
	void Eliminar(){
		System.out.println("Modificando el empleado");
	}
	
	void Consultar(){
		System.out.println("Modificando el empleado");
	}
}



	/*public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public float getSalario() {
		return salario;
	}



	public void setSalario(float salario) {
		this.salario = salario;
	}



	public String getFechaContratacion() {
		return FechaContratacion;
	}



	public void setFechaContratacion(String fechaContratacion) {
		FechaContratacion = fechaContratacion;
	}



	@Override
	public String toString() {
		return "Empleado [departamento=" + departamento + ", salario=" + salario + ", FechaContratacion="
				+ FechaContratacion + ", getDepartamento()=" + getDepartamento() + ", getSalario()=" + getSalario()
				+ ", getFechaContratacion()=" + getFechaContratacion() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + ", getEmail()="
				+ getEmail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}*/
	
	

	
	

