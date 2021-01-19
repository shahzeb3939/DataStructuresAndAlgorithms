package linked_list;

import java.util.Arrays;

public class RunClass {

    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();

        linkedList.addLast(40);
        linkedList.print();

        linkedList.addLast(20);
        linkedList.print();

        linkedList.deleteLast();
        linkedList.print();

        linkedList.addFirst(50);
        linkedList.print();

        linkedList.addFirst(30);
        linkedList.print();

        linkedList.deleteFirst();
        linkedList.print();

        linkedList.addLast(60);
        linkedList.print();

        System.out.println(linkedList.size());

        System.out.println(Arrays.toString(linkedList.toArray()));


//        linkedList.deleteLast();
//        linkedList.print();

//        System.out.println(linkedList.size());

//        linkedList.deleteLast();
//        linkedList.print();
//

//        System.out.println(linkedList.contains(20));

//        System.out.println(linkedList.indexOf(60));

//        linkedList.deleteLast();
//        linkedList.print();

//        linkedList.deleteFirst();
//        linkedList.print();
    }
}
