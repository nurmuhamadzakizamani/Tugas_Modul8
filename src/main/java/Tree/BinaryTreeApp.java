
package Tree;

public class BinaryTreeApp {
    public static void main(String[] args){
        
    BinaryTree tree= new BinaryTree();
    
    TreeNode node;
    
    node = new TreeNode('D');
    tree.insert(node);
    
    node = new TreeNode('B');
    tree.insert(node);
    
    node = new TreeNode('A');
    tree.insert(node);
    
    node = new TreeNode('C');
    tree.insert(node);
    
    node = new TreeNode('F');
    tree.insert(node);
    
    node = new TreeNode('E');
    tree.insert(node);
    
    node = new TreeNode('G');
    tree.insert(node);
    
    System.out.print("Traversal dengan preorder :");
    tree.preOrder();
    System.out.print("\nTraversal dengan posorder :");
    tree.postOrder();
    System.out.print("\nTraversal dengan inorder :");
    tree.inOrder();
    System.out.println();
    }   
}

