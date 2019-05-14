package BasicKnowledge;

/**
 * @Author: ly2333
 * @Date: 2019-05-14 14:27
 * @Project: CareerLearning
 * @Package: BasicKnowledge
 * @Version: 1.0
 */
public class LinkedListBuilder {
    public Node head;
    public Node pointer;

    public LinkedListBuilder(Node head) {
        this.head = head;
        this.pointer = head;
    }

    public LinkedListBuilder add(Node n) {
        pointer.setNext(n);
        pointer = n;
        return this;
    }

    public Node toLinkedList() {
        return head;
    }
}
