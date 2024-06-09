package pkgs.data_structures.linked_list;

import java.util.function.Consumer;

public class LinkedList {
    private int length = 0;
    private Node head;
    private Node tail;

    public LinkedList(Node node){
        incrementLength();
        node.setIdx(length - 1);
        this.head = node;
        this.tail = node;
    }

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }

    public int getLength(){
        return length;
    }

    public Node getNodeAtIdx(int idx){
        final Node[] nodeAtIdx = new Node[1];
        nodeAtIdx[0] = null;

        traverse((node) -> {
            if(node.getIdx() == idx){
                nodeAtIdx[0] = node; 
            }
        });

        return nodeAtIdx[0];
    }

    public void push(Node node){
        if (node == null) {
            throw new Error("Invalid node");
        }
        
        if (this.tail == null) {
            this.length = 1;
            node.setIdx(length - 1);
            this.head = node;
            this.tail = node;
        } else {
            incrementLength();
            node.setIdx(length - 1);
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public Node pop() {
        final Node[] lastNode = new Node[1];
        lastNode[0] = null;
    
        traverse((node) -> {
            if(length == 1){
                lastNode[0] = node;
                this.head = null;
                this.tail = null;
            }
            else if (node.getIdx() == length - 2) {
                lastNode[0] = node.getNext();
                this.tail = node;
                node.setNext(null);
            }
        });
        decrementLength();
    
        return lastNode[0];
    }

    public void traverse(Consumer<Node> cb){
        Node current = this.head;
        while(current != null){
            cb.accept(current);
            current = current.getNext();
        }
    }

    private void incrementLength(){
        this.length = this.length + 1;
    }
    private void decrementLength(){
        this.length = this.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.getIdx()).append(":").append(current.getData()).append(current.getIdx() == length - 1 ? "" : " -> ");
            current = current.getNext();
        }
        return sb.toString();
    }
}