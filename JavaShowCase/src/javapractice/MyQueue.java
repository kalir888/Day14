package javapractice;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enQueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    public void printMyQueue() {
        myLinkedList.printMyNodes();
    }

    public INode deQueue() {
        INode tempNode = myLinkedList.pop();
        return tempNode;
    }

    public int size() {
        int size = myLinkedList.size();
        return size;
    }
}
