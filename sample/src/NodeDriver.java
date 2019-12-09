public class NodeDriver {

  public static void main(String[] args) {
    Node root = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    Node node7 = new Node(7);

    root.setLeftChild(node2);
    root.setRightChild(node3);
    node2.setLeftChild(node4);
    node2.setRightChild(node5);
    node5.setLeftChild(node7);
    node3.setRightChild(node6);

//    root.printInOrder();
//    System.out.println("\n");
//    root.printPostOrder();
//    System.out.println("\n");
//    root.printPreOrder();

    root.print();
  }

}
