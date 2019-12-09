public class BTree {

  private Node root;
  private Node currentNode;

  public BTree() {
    root = null;
  }

  public boolean search(int data) {
    return search(root, data);
  }

  public boolean search(Node node, int data) {
    if (node.getData() == data) return true;
    if (node.getLeftChild() != null) {
      if (search(node.getLeftChild(), data)) return true;
    }
    if (node.getRightChild() != null) {
      if (search(node.getRightChild(), data)) return true;
    }
    return false;
  }

  public int countNodes(Node node) {
    if (node == null) return 0;
    int count = 1;
    count += countNodes(node.getLeftChild());
    count += countNodes(node.getRightChild());
    return count;
  }
}
