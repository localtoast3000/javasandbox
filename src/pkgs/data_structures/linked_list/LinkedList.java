package pkgs.data_structures.linked_list;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(Node node){
        this.head = node;
        this.tail = node;
    }

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }

    public void push(Node node){
        if (node == null) {
            return;
        }
        
        if (this.tail == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.getData()).append(" -> ");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}