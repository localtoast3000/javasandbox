import pkgs.data_structures.linked_list.*;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList(new Node("I am the Head"));
        list.push(new Node("I am the second element"));
        list.push(new Node("I am the third element"));
        list.push(new Node("I am the fourth element"));
        list.push(new Node("I am the tail element"));

        list.traverse((node) -> {
            if(node.getIdx() == 2){
                node.setData(123456);
            }
        });

        System.out.println(list.getNodeAtIdx(2).getData());
    }
}
