import  pkgs.data_structures.linked_list.*;

public class Main {
    public static void main(String[] args){
       LinkedList list = new LinkedList(new Node("Head"));
       var length = 10;

       for(var i = 0; i < length - 1; i++){
           list.push(new Node(Math.random()));
           System.out.println(list);
       }

        for(var i = list.getLength(); i > list.getLength() - 1; i--){
            list.pop();
            System.out.println(list);
        }
    }
}
