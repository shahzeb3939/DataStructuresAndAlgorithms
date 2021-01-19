package my_array;

import java.util.Arrays;

public class MyArray {
    private int[] array;
    private int length;
    private int count;

    public MyArray(int length) {
        this.length = length;
        this.array = new int[length];
        this.count = 0;
    }

    public void insert(int item) {
        if(count < length) {
            array[count] = item;
        } else {
            int[] newArray = new int[count + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[count] = item;
            array = newArray;
            length = count + 1;
        }
        count = count + 1;
    }

    public int indexOf(int searchItem) {
        for(int i=0; i<length; i++) {
            if(array[i] == searchItem) {
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if(index == length - 1) {
            int[] newArray = new int[length - 1];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array = newArray;
        } else if(index == 0) {
            int[] newArray = new int[length -1];
            System.arraycopy(array, 1, newArray, 0, newArray.length);
            array = newArray;
        } else {
            int[] newArrayLeft = new int[index];
            System.arraycopy(array, 0, newArrayLeft, 0, index);
            int[] newArrayRight = new int[length - index - 1];
            System.arraycopy(array, index + 1, newArrayRight, 0, length - index - 1);
            int[] newArray = new int[length - 1];
            System.arraycopy(newArrayLeft, 0, newArray, 0, index);
            System.arraycopy(newArrayRight, 0, newArray, index, length - index - 1);
            array = newArray;
        }
        count = count - 1;
        length = length - 1;
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }
}
