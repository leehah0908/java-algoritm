package recursive;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class BinaryTreeDFS {
    static Node root;

    public static void DFS(Node root) {
        if (root == null) return;
        // 전위 탐색
        System.out.print(root.data + " ");
        DFS(root.lt);
        // 중위 탐색
        // System.out.print(root.data + " ");
        DFS(root.rt);
        // 후위 탐색
        // System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        DFS(root);
    }
}
