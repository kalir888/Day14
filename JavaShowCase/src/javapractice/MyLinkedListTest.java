package javapractice;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public static void main(String args[]) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.search(30);
        myLinkedList.printMyNodes();
    }
}
