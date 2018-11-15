package javaDz.tasks.collection.classes.list;

class Node<T>
{
  T element;
  Node<T> nextNode;
  Node<T> previosNode;

  public Node(Node<T> previosNode, T element, Node<T> nextNode)
  {
    this.element = element;
    this.nextNode = nextNode;
    this.previosNode = previosNode;
  }

}
