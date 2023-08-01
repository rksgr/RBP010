package ds;

import java.util.LinkedList;

public class LinkedListDemo {

    Node head;
    Node tail;
    public LinkedListDemo(Node head, Node tail){
        this.head = head ;
        this.tail = tail;
    }
    public void printLinkedListElements(LinkedListDemo linkedListDemo){
//        System.out.println(linkedListDemo.head.key);
//        System.out.println(linkedListDemo.tail.key);

        Node currentNode = linkedListDemo.head;
        while(currentNode.next != null){
            System.out.print(currentNode.key+ " -> ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.key);
    }
    public void addElement(LinkedListDemo linkedListDemo, Node newNode){
        printLinkedListElements(linkedListDemo);

        if (linkedListDemo.head == null){
            linkedListDemo.head = newNode;
            linkedListDemo.tail = newNode;
        }
        // addition changes the head

        Node oldHead = linkedListDemo.head;// store the old linked list's head
        newNode.next= oldHead;// establish the connection with linked list
        linkedListDemo.head = newNode;// declare new node as the head

        printLinkedListElements(linkedListDemo);
    }

    public static void main(String[] args) {
        Node node1 = new Node(23,null);
        Node node2 = new Node(34,node1);
        Node node3 = new Node(9, node2);
        Node node4 = new Node(17,node3);
        LinkedListDemo lldObj = new LinkedListDemo(node4, node1);
        Node node5 = new Node(14,null);
        lldObj.addElement(lldObj,node5);

//        lldObj.printLinkedListElements(lldObj);
    }

    public void doSomething(){
        LinkedList<Integer> llInt = new LinkedList<>();// Please don't do this
    }
}

class Node{
    int key;
    Node next;
    public Node (int key, Node next){
        this.key = key;
        this.next = next;
    }
}