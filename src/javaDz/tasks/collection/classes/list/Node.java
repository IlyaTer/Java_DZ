package javaDz.tasks.collection.classes.list;

public class Node<T>
{
  private int posIndex;
  private T element;
  private Node<T> nextNode;
  private Node<T> previosNode;

  public Node(int posIndex,T element)
  {
    this.posIndex = posIndex;
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

  public int getPosIndex()
  {
    return posIndex;
  }

  public void setPosIndex(int posIndex)
  {
    this.posIndex = posIndex;
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
