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

    public int size() {
        return myLinkedList.size();
    }

    public INode pop() {
        INode tempNode = myLinkedList.pop();
        return tempNode;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
