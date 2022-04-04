package javapractice;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode newNode) {
        myLinkedList.add(newNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }


    public INode peak() {
        return myLinkedList.head;
    }
}
