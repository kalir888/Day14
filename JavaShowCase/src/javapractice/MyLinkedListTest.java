package javapractice;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public static void main(String args[]) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.sortAdd(myFirstNode);
        myLinkedList.sortAdd(mySecondNode);
        myLinkedList.sortAdd(myThirdNode);
        myLinkedList.sortAdd(myFourthNode);
        System.out.println(myLinkedList.size());
        myLinkedList.printMyNodes();
    }
}
