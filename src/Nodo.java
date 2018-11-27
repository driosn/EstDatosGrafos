public class Nodo {
    Nodo hizq;
    int clave;
    Estudiante dato;
    Nodo hder;

    public Nodo(){
        hizq = null; clave = 0; dato = null; hder = null;
    }

    public Nodo(int cx, Estudiante dx){
        hizq = null; clave = cx; dato = dx; hder = null;
    }
}
