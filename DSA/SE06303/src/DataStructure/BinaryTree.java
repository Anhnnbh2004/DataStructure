package DataStructure;
public class BinaryTree {
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
    
        TreeNode root;
    
        public BinaryTree() {   
            // Tạo các nút trong cây
            TreeNode n18 = new TreeNode(18);
            TreeNode n12 = new TreeNode(12);
            TreeNode n35 = new TreeNode(35);
            TreeNode n4 = new TreeNode(4);
            TreeNode n15 = new TreeNode(15);
            TreeNode n22 = new TreeNode(22);
            TreeNode n58 = new TreeNode(58);
            TreeNode nMinus2 = new TreeNode(-2);
            TreeNode n7 = new TreeNode(7);
            TreeNode n13 = new TreeNode(13);
            TreeNode n16 = new TreeNode(16);
            TreeNode n19 = new TreeNode(19);
            TreeNode n31 = new TreeNode(31);
            TreeNode n40 = new TreeNode(40);
            TreeNode n87 = new TreeNode(87);
    
            // Xây dựng cấu trúc của cây theo sơ đồ
            n18.left = n12;
            n18.right = n35;
            n12.left = n4;
            n12.right = n15;
            n4.left = nMinus2;
            n4.right = n7;
            n15.left = n13;
            n15.right = n16;
            n35.left = n22;
            n35.right = n58;
            n22.left = n19;
            n22.right = n31;
            n58.left = n40;
            n58.right = n87;
            
            root = n18;  // Gán gốc của cây
        }
    
        // Phương thức kiểm tra xem một giá trị có tồn tại trong cây hay không
        public boolean contains(int value) {
            return contains(root, value);
        }
    
        // Hàm đệ quy kiểm tra giá trị trong cây
        private boolean contains(TreeNode node, int value) {
            if (node == null) {
                return false; // Nếu nút hiện tại là null, không tìm thấy giá trị
            }
            if (node.value == value) {
                return true; // Tìm thấy giá trị trong cây
            } else if (value < node.value) {
                return contains(node.left, value); // Tìm trong cây con bên trái
            } else {
                return contains(node.right, value); // Tìm trong cây con bên phải
            }
        }
    
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
    
            int value1 = 10;
            int value2 = 40;
    
            System.out.println(value1 + " : " + tree.contains(value1));
            System.out.println(value2 + " : " + tree.contains(value2));
        }
}
