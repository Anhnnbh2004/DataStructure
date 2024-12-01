package DataStructure;

// Implement Tree in java
// Node(value, leftNode, rightNode)

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class MyTree {
    // Nút gốc root
    public TreeNode root;

    public MyTree() {
        this.root = null;
        TreeNode n1 = new TreeNode(42);
        TreeNode n2 = new TreeNode(15);
        TreeNode n3 = new TreeNode(9);
        TreeNode n4 = new TreeNode(27);
        TreeNode n5 = new TreeNode(86);
        TreeNode n6 = new TreeNode(3);
        TreeNode n7 = new TreeNode(48);
        TreeNode n8 = new TreeNode(12);
        TreeNode n9 = new TreeNode(39);
        TreeNode n10 = new TreeNode(5);

        // Xây dựng cây:
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.left = n5;
        n3.right = n6;
        n4.left  = n7;
        n5.right = n8;
        n6.right = n9;
        n8.left = n10;
        root = n1;
    }

    public static void print(TreeNode root) {
        if (root != null) {
            print(root.left);
            print(root.right);
            System.out.println(root.value);     
        }
    }
    
}