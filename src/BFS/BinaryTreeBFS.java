package BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class BinaryTreeBFS {
    static Node root;

    public static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    queue.add(cur.lt);
                }
                if (cur.rt != null) {
                    queue.add(cur.rt);
                }
            }
            level++;
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        BFS(root);
    }
}
