import java.util.Calendar;
import java.util.GregorianCalendar;

public class Estudiante {
    protected int ci, semestreIngreso;
    protected String nombre, carrera;
    protected GregorianCalendar fechaNac;

    public Estudiante(){
        nombre = null; carrera = null; fechaNac = null; ci = 0; semestreIngreso = 0;
    }

    public void leer(){
        System.out.print("Ingrese el nombre: "); nombre = Leer.dato();
        System.out.print("Ingrese la carrera: "); carrera = Leer.dato();
        System.out.print("Ingrese el semestre de ingreso: "); semestreIngreso = Leer.datoInt();
        System.out.println("Fecha de nacimiento");
        System.out.print("      Dia; "); int dia = Leer.datoInt();
        System.out.print("      Mes; "); int mes = Leer.datoInt();
        System.out.print("      Año; "); int año = Leer.datoInt();
        fechaNac = new GregorianCalendar(dia,mes,año);
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("C.I: " + ci);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre Ingreso: " + semestreIngreso);
        System.out.println("FechaNacimiento: " + fechaNac.get(Calendar.DAY_OF_MONTH) + "/" + fechaNac.get(Calendar.MONTH) + "/" + fechaNac.get(Calendar.YEAR) + "/");
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public int getCi(){
        return ci;
    }

    public int getSemestreIngreso(){
        return semestreIngreso;
    }

    public void setCi(int x){
        ci = x;
    }
}
