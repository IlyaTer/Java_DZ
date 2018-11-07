package javaDz.tasks.collection.classes.iterator;

import javaDz.tasks.collection.classes.list.Node;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T>
{
  private Node<T> current;

  public ListIterator(Node<T> current)
  {
    this.current = current;
  }

  @Override
  public boolean hasNext()
  {
    if(current.getNextNode() != null)
    {
      return true;
    }
    return false;
  }

  @Override
  public T next()
  {
    Node<T> temp = current;
    current = current.getNextNode();
    return temp.getElement();
  }

}
