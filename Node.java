package BasicKnowledge;

/**
 * @Author: ly2333
 * @Date: 2019-05-14 14:25
 * @Project: CareerLearning
 * @Package: BasicKnowledge
 * @Version: 1.0
 */
public class Node {
    public Node next;
    public Node previous;
    public int value;

    public Node(int value) {
        this.value = value;
        next = previous = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
