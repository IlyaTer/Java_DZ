package javaDz.tasks.collection.classes.list;

class Node<T>
{
  private T element;
  private Node<T> nextNode;
  private Node<T> previosNode;

  public Node(T element)
  {
    this.element = element;
  }

  public Node<T> getNextNode()
  {
    return nextNode;
  }

  public void setNextNode(Node<T> nextNode)
  {
    this.nextNode = nextNode;
  }

  public T getElement()
  {
    return element;
  }

  public void setElement(T element)
  {
    this.element = element;
  }

  public Node<T> getPreviosNode()
  {
    return previosNode;
  }

  public void setPreviosNode(Node<T> previosNode)
  {
    this.previosNode = previosNode;
  }

}
