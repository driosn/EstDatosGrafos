public class Principal {
    public static void main(String[] args){
        Operaciones op = new Operaciones();
        Arbol a = new Arbol();

        op.insertarN(a);
        System.out.println("PREORDEN");
        op.preorden(a.raiz);
        System.out.println("SIMETRICO");
        op.simetrico(a.raiz);
        System.out.println("POSORDEN");
        op.posorden(a.raiz);
        System.out.print("Ingrese el ci del estudiante a buscar: "); int carnet = Leer.datoInt();
        op.buscar(a, carnet);
        System.out.println("Ingrese el ci del estudiante a eliminar: "); carnet = Leer.datoInt();
        a.eliminar(carnet);
        op.preorden(a.raiz);
        System.out.println("Ingrese la carrera del estudiante a eliminar: "); String career = Leer.dato();
        int key = op.buscarClave_carrrera(a, career);
        a.eliminar(key);
        System.out.println("Los estudiantes que cursan despues del quinto semestre son: ");
        op.est_antiguos(a.raiz);
        System.out.println("Los estudiantes mayores a 20 años son: ");
        op.est_viejos(a.raiz);
    }
}
