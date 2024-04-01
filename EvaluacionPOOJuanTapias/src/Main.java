
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Estudiante estudiante1 = new Estudiante("esteban \n", "carrera #15 \n", "321234 \n", "estaban@gmail.com \n", 3);
		System.out.println("Informcaion estudiante: " + estudiante1.getNombre() 
		 + estudiante1.getDireccion() + estudiante1.getTelefono() + estudiante1.getEmail() + estudiante1.estado);*/
		
		Empleado empleado1 = new Empleado("Jose \n", "Carrera #46 \n", "320303020 \n", "Jose@gmail.com \n", "Dep 17" ,700000, "\n 10-08-2005");
		System.out.println(empleado1.getNombre() + empleado1.getDireccion() + empleado1.getTelefono() + empleado1.getEmail() + empleado1.departamento + empleado1.salario + empleado1.FechaContratacion);
		
	}

}
