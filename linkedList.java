public class linkedList {

    // initialize nodes
    node head;
    node tail;
    node curr;

    // linked list method | head, tail, and current set to null
    public linkedList() {
        this.head = null;
        this.tail = null;
        this.curr = null;
    }
    public void setCurrToHead() {
        curr = head;
    }
    public void setCurrToTail() {
        curr = tail;
    }
    public node getCurr() {
        return curr;
    }
    public void setCurr(node curr) {
        this.curr = curr;
    }
    // add method | create node | if head is null, set head, tail, and current to new node |
    public void add (String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            curr = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }
    public void push (String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            curr = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void enQueue (String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            curr = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }
    public boolean isEmpty() {
        return head == null;
    }
    public String pop () {
        if (head == null) {
            return null;
        } else {
            String data = head.getCandyName();
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;
            }
            return data;
        }
    }
    public String deQueue () {
        if (head == null) {
            return null;
        } else {
            String data = tail.getCandyName();
            tail = tail.getPrev();
            if (tail != null) {
                tail.setNext(null);
            } else {
                head = null;
            }
            return data;
        }
    }
    public String remove (node junk) {
        if (head == null) {
            return null;
        } else if (junk == head) {
            String data = head.getCandyName();
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;
            }
            return data;
        } else if (junk == tail) {
            String data = tail.getCandyName();
            tail = tail.getPrev();
            if (tail != null) {
                tail.setNext(null);
            } else {
                head = null;
            }
            return data;
        } else {
            String data = junk.getCandyName();
            junk.getNext().setPrev(junk.getPrev());
            junk.getPrev().setNext(junk.getNext());
            return data;
        }
    }
}

