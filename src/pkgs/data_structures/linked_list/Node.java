package pkgs.data_structures.linked_list;

public class Node {
    private int idx;
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public int getIdx(){
        return idx;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}