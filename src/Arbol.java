public class Arbol {
    Nodo raiz;

    public Arbol(){
        raiz = null;
    }

    public void inicializar(){
        raiz = null;
    }

    public boolean arbolVacio(){
        return raiz == null;
    }

    public void insertar(int c, Estudiante d){
        Nodo nuevo = new Nodo(c,d);
        if(arbolVacio()){
            raiz = nuevo;
        }else{
            Nodo p = raiz, q = null;
            while(p != null){
                q = p;
                if(p.clave > c) p = p.hizq;
                else p = p.hder;
            }
            if(q.clave > c) q.hizq = nuevo;
            else q.hder = nuevo;
        }

    }

    public void eliminar(int cx){
        Nodo p,q;
        q = null; p = raiz;
        while((p != null) && (p.clave != cx)){
            q = p;
            if(p.clave > cx) p = p.hizq;
            else p = p.hder;
        }
        if(p == null) System.out.println("Nodo no localizado");
        else{
            if(p == raiz) raiz = conecta(raiz);
            else if(q.hder == p) q.hder = conecta(q.hder);
            else q.hizq = conecta(q.hizq);
        }
    }

    public Nodo conecta(Nodo a) {
        Nodo b = a;
        if((a.hder == null) && (a.hizq == null)){
            a = null;
        }else if(a.hder == null){
            a = b.hizq;
        }else if(a.hizq == null){
            a = b.hder;
        }else{
            a = b.hder;
            Nodo q = null, p = a;
            while(p != null){
                q = p;
                p = p.hizq;
            }
        }
        return a;
    }


}
