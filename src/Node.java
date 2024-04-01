public class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Object value() {
        return this.data;
    }

    public Node next() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void showContent() {
        System.out.print(data);
    }

    public void setNetx(Node next) {
    }
}

