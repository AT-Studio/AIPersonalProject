import java.util.List;

public class Node {

  private int data;
  private Node parent;
  private Node leftChild;
  private Node rightChild;

  public Node(int data) {
    this.data = data;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(Node leftChild) {
    this.leftChild = leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

  public void setRightChild(Node rightChild) {
    this.rightChild = rightChild;
  }

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void printPreOrder() {
    System.out.print(data);
    if (leftChild != null) leftChild.printPreOrder();
    if (rightChild != null) rightChild.printPreOrder();
  }

  public void printPostOrder() {
    if (leftChild != null) leftChild.printPostOrder();
    if (rightChild != null) rightChild.printPostOrder();
    System.out.print(data);
  }

  public void printInOrder() {
    if (leftChild != null) leftChild.printInOrder();
    System.out.print(data);
    if (rightChild != null) rightChild.printInOrder();
  }

  public String print() {
    return print("", true, "");
  }

  public String print(String prefix, boolean isTail, String sb) {
    if (rightChild != null) {
      rightChild.print(prefix + (isTail ? "|   " : "    "), false, sb);
    }
    System.out.println(prefix + (isTail ? "\\-- " : "/-- ") + data);
    if (leftChild != null) {
      leftChild.print(prefix + (isTail ? "    " : "|   "), true, sb);
    }
    return sb;
  }

}
