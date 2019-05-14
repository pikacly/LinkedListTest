package BasicKnowledge;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: ly2333
 * @Date: 2019-05-14 14:34
 * @Project: CareerLearning
 * @Package: BasicKnowledge
 * @Version: 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        // 构造一个1-10的有序链表
        LinkedListBuilder llb = new LinkedListBuilder(new Node(0));
        for(int i=1; i<=10; i++)
            llb.add(new Node(i));
        Node p = llb.toLinkedList(); // 返回头指针
        /* 逆序打印链表并取出倒数第K个元素 */
        Stack<Node> nodes = new Stack<>();
        int i = 0;
        int k = 5; // 假设K=5
        Node knode = p;
        while(p != null) {
            nodes.push(p);
            p = p.next;
        }
        while(!nodes.empty()) {
            i++;
            Node temp = nodes.pop();
            if(i == k)
                knode = temp;
            System.out.print(temp.value + " ");
        }
        System.out.println("倒数第k个元素的值为" + knode.value);
    }
}
