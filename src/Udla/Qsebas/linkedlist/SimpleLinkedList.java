package Udla.Qsebas.linkedlist;

import Udla.Qsebas.linkedlist.Node;

public class SimpleLinkedList {
    private Node first; // creacion del atributo firdst

    public SimpleLinkedList() { // contrucotr sin valores
        this.first = null;
    }
    public void push(Object obj) {
        Node newNode = new Node(obj);
        // Si la lista está vacía, el nuevo nodo es el primer nodo
        if (this.first == null) {
            this.first = newNode;
        } else {
            // Si la lista no está vacía, el nuevo nodo se enlaza al primer nodo
            // y luego se convierte en el nuevo primer nodo
            newNode.setNext(this.first);
            this.first = newNode;
        }
    }

    public Node pop (){
    Node temp=this.first; //Guardo referencias de contenido en un variable temp (temperoral)
    this.first=this.first.next();
    return temp;

    }
    public Node delete(Object val){
    Node currentNode=this.first;
    Node previousNode=this.first;

    while (!currentNode.value().equals(val)){
        if(currentNode.next()==null){
    return null;
    }else {
    previousNode=currentNode;
    currentNode=currentNode.next();
            }
}
        if(currentNode==this.first){
            this.first=this.first.next();
        }else {
            previousNode.setNetx(currentNode.next());
        }
        return currentNode;
    }
    public void prinContent(){
        Node currentNode=first;
        while (currentNode !=null){
            currentNode.showContent();
            currentNode=currentNode.next();
        }
    }


}




