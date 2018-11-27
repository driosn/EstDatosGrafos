import java.util.Calendar;

public class Operaciones {

    public Arbol insertarN(Arbol a){
        System.out.print("No de nodos: "); int nd = Leer.datoInt();
        for(int i=1; i<=nd; i++){
            System.out.println("Nodo: " + i + ": ");
            System.out.print("Clave: "); int c = Leer.datoInt();
            Estudiante d = new Estudiante();
            d.leer();
            d.setCi(c);
            a.insertar(c,d);
        }
        return a;
    }

    public void buscar(Arbol a, int cb){
        Nodo p = a.raiz;
        while ((p != null) && (p.clave != cb)){
            if(p.clave > cb) p = p.hizq;
            else p = p.hder;
        }
        if(p == null) System.out.println("Nodo no localizado");
        else {
            System.out.println("El estudiante buscado es: ");
            p.dato.mostrar();
        }
    }

    public void preorden(Nodo p){
        if(p != null){
            p.dato.mostrar();
            preorden(p.hizq);
            preorden(p.hder);
        }
    }

    public void simetrico(Nodo p){
        if(p != null){
            simetrico(p.hizq);
            p.dato.mostrar();
            simetrico(p.hder);
        }
    }

    public void posorden(Nodo p){
        if(p != null){
            posorden(p.hizq);
            posorden(p.hder);
            p.dato.mostrar();
        }
    }

    public int buscarClave_carrrera(Arbol a, String cb){
        Nodo p = a.raiz;
        while ((p != null) && (p.dato.getCarrera().compareTo(cb) != 0)){
            if(p.dato.getCarrera().compareTo(cb) > 0) p = p.hizq;
            else p = p.hder;
        }
        if(p == null) System.out.println("Nodo no localizado");
        return p.clave;
    }

    public void est_antiguos(Nodo p){
        if(p != null){
            if(p.dato.getSemestreIngreso() > 5) p.dato.mostrar();
            est_antiguos(p.hizq);
            est_antiguos(p.hder);
        }
    }

    public void est_viejos(Nodo p){
        if(p != null){
            if(p.dato.getFechaNac().get(Calendar.YEAR) < 1999){
                System.out.println("CI: " + p.dato.getCi());
                System.out.println("Nombre: " + p.dato.getNombre());
            }
            est_viejos(p.hizq);
            est_viejos(p.hder);
        }
    }
}
