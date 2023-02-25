public class EmpleadoInstancia {
public static void main(String[] args) {

Empleado empleado1 = new Empleado("Pedro Paredes", 10500, 21710443, 2000, 03, 19);
Empleado empleado2 = new Empleado("Ricardo Ochoa", 7600, 25173381, 2007, 10, 7);
Empleado empleado3 = new Empleado("Mariana Navarro", 9200, 23896904, 2005, 11, 21);
Empleado empleado4 = new Empleado("Pablo Leal", 18000, 22411231, 2008, 05, 23);
Empleado empleado5 = new Empleado("Gabriela Matos", 5200, 9144875, 1991, 02, 22);

System.out.println(empleado1.getnombre());
System.out.println(empleado1.DimeDescripcion());
System.out.println(empleado1.dimeSueldo());
System.out.println(empleado1.damefechaContrato());

System.out.println(empleado2.getnombre());
System.out.println(empleado2.DimeDescripcion());
System.out.println(empleado2.dimeSueldo());
System.out.println(empleado2.damefechaContrato());
		
System.out.println(empleado3.getnombre());
System.out.println(empleado3.DimeDescripcion());
System.out.println(empleado3.dimeSueldo());
System.out.println(empleado3.damefechaContrato());
		
System.out.println(empleado4.getnombre());
System.out.println(empleado4.DimeDescripcion());
System.out.println(empleado4.dimeSueldo());
System.out.println(empleado4.damefechaContrato());
		
System.out.println(empleado5.getnombre());
System.out.println(empleado5.DimeDescripcion());
System.out.println(empleado5.dimeSueldo());
System.out.println(empleado5.damefechaContrato());	

}
}