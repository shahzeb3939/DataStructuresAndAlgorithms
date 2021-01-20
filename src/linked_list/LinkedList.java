package linked_list;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        size = 0;
//        this.first = new Node();
//        this.last = new Node();
    }

    public void addLast(int value) {
        Node nodeToBeAdded = new Node();
        nodeToBeAdded.setValue(value);
        if(first == null) {
            first = nodeToBeAdded;
            last = nodeToBeAdded;
        } else {
            last.setNext(nodeToBeAdded);
            last = nodeToBeAdded;
        }
        size++;



//        Node nodeToBeAdded = new Node();
//        nodeToBeAdded.setValue(value);
//
//        Node iteratorNode = first.getNext();
//        if(iteratorNode == null) {
//            first.setNext(nodeToBeAdded);
//            nodeToBeAdded.setNext(last);
//        } else {
//            while(iteratorNode.getNext().getNext() != null) {
//                iteratorNode = iteratorNode.getNext();
//            }
//            iteratorNode.setNext(nodeToBeAdded);
//            nodeToBeAdded.setNext(last);
//        }
    }

    public void addFirst(int value) {
        Node nodeToBeAdded = new Node();
        nodeToBeAdded.setValue(value);
        if(first == null) {
            first = last = nodeToBeAdded;
        } else {
            nodeToBeAdded.setNext(first);
            first = nodeToBeAdded;
        }
        size++;



//        Node nodeToBeAdded = new Node();
//        nodeToBeAdded.setValue(value);
//
//        if(first.getNext() == null) {
//            first.setNext(nodeToBeAdded);
//            nodeToBeAdded.setNext(last);
//            last.setNext(null);
//        } else {
//            Node nodeAfterFirst = first.getNext();
//            nodeToBeAdded.setNext(nodeAfterFirst);
//            first.setNext(nodeToBeAdded);
//        }
    }

    public void deleteFirst() {
        if(first != null) {
            first = first.getNext();
            size--;
        }


//        Node nodeToBeDeleted = first.getNext();
//        if(first.getNext() != null) {
//            first.setNext(nodeToBeDeleted.getNext());
//            nodeToBeDeleted.setNext(null);
//        }
    }

    public void deleteLast() {
        if(first != null) {
            if(first.getNext() == null) {
                first = null;
                last = null;
            } else {
                Node iteratorNode = first;
                Node previousToIteratorNode = new Node();
                while (iteratorNode.getNext() != null) {
                    previousToIteratorNode = iteratorNode;
                    iteratorNode = iteratorNode.getNext();
                }
                last = previousToIteratorNode;
                last.setNext(null);
            }
            size--;
        }



//        if(first.getNext() != null) {
//            Node iteratorNode = first.getNext();
//            Node previousNodeToIteratorNode = new Node();
//            while (iteratorNode.getNext().getNext() != null) {
//                previousNodeToIteratorNode = iteratorNode;
//                iteratorNode = iteratorNode.getNext();
//            }
//            previousNodeToIteratorNode.setNext(iteratorNode.getNext());
//            iteratorNode.setNext(null);
//        }
    }

    public boolean contains(int value) {
        Node iteratorNode = first;
        do {
            if(iteratorNode.getValue() == value)
                return true;
            iteratorNode = iteratorNode.getNext();
        } while (iteratorNode != null);
        return false;



//        if(first.getNext() != null) {
//            Node iteratorNode = first.getNext();
//            while (iteratorNode.getNext() != null) {
//                if(iteratorNode.getValue() == value)
//                    return true;
//                iteratorNode = iteratorNode.getNext();
//            }
//        }
//        return false;
    }

    public int indexOf(int value) {
        Node iteratorNode = first;
        int indexCounter = 0;
        do {
            if(iteratorNode.getValue() == value)
                return indexCounter;
            iteratorNode = iteratorNode.getNext();
            indexCounter += 1;
        } while (iteratorNode != null);
        return -1;



//        if(first.getNext() != null) {
//            Node iteratorNode = first.getNext();
//            int indexCounter = 0;
//            while (iteratorNode.getNext() != null) {
//                if(iteratorNode.getValue() == value)
//                    return indexCounter;
//                iteratorNode = iteratorNode.getNext();
//                indexCounter+=1;
//            }
//        }
//        return -1;
    }


    public int size() {
        return this.size;
    }

//    public int size() {
//        if(first != null) {
//            Node iteratorNode = first;
//            int counter = 1;
//            while (iteratorNode.getNext() != null) {
//                counter += 1;
//                iteratorNode = iteratorNode.getNext();
//            }
//            return counter;
//        }
//        return 0;
//    }


    public int[] toArray() {
        int[] array = new int[this.size];
        Node iteratorNode = first;
        int index = 0;
        while (iteratorNode != null) {
            array[index] = iteratorNode.getValue();
            index += 1;
            iteratorNode = iteratorNode.getNext();
        }
        return array;
    }


    public void reverse(){
        if(first != null && size != 1) {
            Node iteratorNode = first;
            Node tempNextNode = first.getNext();
            iteratorNode.setNext(null);
            last = iteratorNode;
            Node tempPreviousNode = iteratorNode;
            iteratorNode = tempNextNode;
            while (iteratorNode.getNext() != null) {
                tempNextNode = iteratorNode.getNext();
                iteratorNode.setNext(tempPreviousNode);
                tempPreviousNode = iteratorNode;
                iteratorNode = tempNextNode;
            }
            iteratorNode.setNext(tempPreviousNode);
            first = iteratorNode;
        }
    }


    public void print() {
        System.out.println("Linked List: ");
        Node iteratorNode = first;
        if(first != null) {
            System.out.println(iteratorNode.getValue());
            while (iteratorNode.getNext() != null) {
                iteratorNode = iteratorNode.getNext();
                System.out.println(iteratorNode.getValue());
            }
        }
        System.out.println("<- --- ->");



//        System.out.println("Linked List: ");
//        if(first.getNext() != null) {
//            Node node = first.getNext();
//            while (node.getNext() != null) {
//                System.out.println(node.getValue());
//                node = node.getNext();
//            }
//        }
//        System.out.println("<- --- ->");
    }
}




//addFirst
//addLast
//deleteFirst
//deleteLast
//contains
//indexOf
//size
//toArray
//reverse
