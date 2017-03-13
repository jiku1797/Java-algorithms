// Building a binary search tree and finding its minimum value

public class Node {
	public int data;
	Node left, right;
	
	Node(int data){
		this.data = data;
	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		Node rootNode = new Node(8);
		tree.insert(rootNode, 4);
		tree.insert(rootNode, 2);
        tree.insert(rootNode, 7);
        tree.insert(rootNode, 3);
        tree.insert(rootNode, 6);
        tree.insert(rootNode, 5);
        
        System.out.println("Minimum value is " + tree.minValue(rootNode));
	}
}

class BinaryTree{
	
	public Node insert(Node node, int data){
		if(node == null){
			return new Node(data);
		}
		else{
			if(data <= node.data){
				node.left = insert(node.left, data);
			}
			else{
				node.right = insert(node.right, data);
			}
		}
		return node;	
	} 
	
	int minValue(Node node){
		Node current = node;
		
		while(current.left != null){
			current = current.left;
		}
		return current.data;
	}	
}
