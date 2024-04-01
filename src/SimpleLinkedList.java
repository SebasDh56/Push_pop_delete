import javax.management.NotificationEmitter;

public class SimpleLinkedList {
    private Node first; // creacion del atributo firdst

    public SimpleLinkedList() { // contrucotr sin valores
        this.first = null;
    }
    public void push(Object obj){

        // esta es la instacioasion de objeto Node
        //para el nuevo nodo de la cabeceroa de la lista

        Node newNode= new Node(obj);
        // El nuevo nodo creado es el primero y luego
        // Newnode es el nuevo primero ed la lista

        newNode.setNetx(this.first);


      }

    public Node pop (){
    Node temp=this.first; //Guardo referencias de contenido en un variable temp (temperoral)
    this.first=this.first.next();
    return temp;

    }
    public Node delete(Object val){
    Node currentNode=this.first;
    Node previousNode=this.first;

    while (!currentNode.vaule.equals(val)){
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




