public class Node {
    private Object data; // Declaracoin de un obaejto llamdo Dara
    private Node netx;  // Declaracion de un atributo del nodo llamdno Next

    public Node (Object dato){  // Contrcutor que recibe parametro el valor que tendra el nodo
        this.data=dato;
    }
    public Node next(){   // contrcutor para apuntar al segunte nodo
        return this.netx;
    }
    public void setNetx(Node netx) {  //ejecucion del punterodel nodo siguente
        this.netx = netx;
    }
    public void showContent(){  // Muestara el contenifo del nodo

        System.out.printf("v");

    }

}
