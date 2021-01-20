package my_array;

public class RunClass {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        myArray.print();

        myArray.insert(10);
        myArray.print();

        myArray.insert(20);
        myArray.print();

        myArray.insert(30);
        myArray.print();

        myArray.insert(40);
        myArray.print();

        myArray.insert(50);
        myArray.print();

        System.out.println(myArray.indexOf(40));

        myArray.removeAt(2);
        myArray.print();
    }
}
