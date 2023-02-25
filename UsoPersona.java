import java.util.Date;
import java.util.GregorianCalendar;


public class UsoPersona {
public static void main(String[] args) {
}
}

abstract class Persona {
String nombre;

public String getnombre() {
return this.nombre;
}

public Persona(String nom) {
this.nombre = nom;
}

public abstract String DimeDescripcion();
}

class Empleado extends Persona {
	
private double sueldo;
private Date altoContrato;
private int ID;
	
public Empleado(String nom, double sueldo, int ID, int agno, int mes, int dia) {
		
super(nom);
this.sueldo = sueldo;
this.ID = ID;
GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
altoContrato = (Date) calendario.getTime();		
}

public String DimeDescripcion() {
return "El empleado tiene la siguiente ID: "+ID
+"\nEl empleado tiene un sueldo de: "+sueldo+"";
}
	
public double dimeSueldo() {
		
return sueldo;
}
	
public Date damefechaContrato() {
return altoContrato;
}
	
public void subSueldo (double porcentaje) {
		
double aumento = (sueldo*porcentaje)/100;
sueldo+=aumento;

}
}