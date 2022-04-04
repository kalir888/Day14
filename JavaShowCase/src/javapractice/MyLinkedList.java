package javapractice;

public class MyLinkedList {
    public INode head;
    public INode tail;
    public int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(this.tail == null)
            this.tail = newNode;
        if(this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
        size++;
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode newNode) {
        if(this.head == null)
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        size++;
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
        size++;
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = this.head.getNext();
        size--;
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tail.setNext(null);
        tempNode = tempNode.getNext();
        size--;
        return tempNode;
    }

    public <K>INode search(K myKey) {
        INode tempNode = head;
        int nodeCount = 1;
        while(!tempNode.getKey().equals(myKey)) {
            tempNode = tempNode.getNext();
            nodeCount++;
        }
        System.out.println("the key value " + myKey + " is in node" + nodeCount);
        return tempNode;
    }

    public <K> void insertWithKey(K mykey, INode newNode) {
        INode temp1Node = head;
        INode temp2Node;
        while(!temp1Node.getKey().equals(mykey)) {
            temp1Node = temp1Node.getNext();
        }
        temp2Node = temp1Node.getNext();
        temp1Node.setNext(newNode);
        newNode.setNext(temp2Node);
        size++;
    }

    public <K> void removeWithKey(K myKey) {
        INode tempNode = head;
        while(!tempNode.getNext().getKey().equals(myKey)) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
        tempNode.getNext().setNext(null);
        size--;
    }

    public int size() {
        return size;
    }

    public <T extends Comparable> void sortAdd(INode newNode) {
        add(newNode);
        if(head.getNext() != null) {
            INode tempNode = head;
            while (tempNode.getNext() != null) {
                T temp1 = (T) tempNode.getKey();
                T temp2 = (T) tempNode.getNext().getKey();
                if (temp1.compareTo(temp2) > 0) {
                    tempNode.setKey(temp2);
                    tempNode.getNext().setKey(temp1);
                }
                tempNode = tempNode.getNext();
            }
        }
    }
}
