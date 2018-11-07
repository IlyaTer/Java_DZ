package javaDz.tasks.collection.classes.list;

import javaDz.tasks.collection.classes.iterator.ListIterator;
import javaDz.tasks.collection.interfaces.ILinkedKist;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyLinkedList<T> implements ILinkedKist<T>
{
  private int newIndex = 0;
  private int size = 0;
  private Node<T> first;
  private Node<T> last;
  private T[] array;

  @Override
  public void add(T element)
  {
    if(first == null)
    {
      first = new Node<T>(newIndex,element);
      last = first;
    }else
    {
      Node<T> temp = new Node<T>(newIndex,element);
      last.setNextNode(temp);
      temp.setPreviosNode(last);
      last = temp;
    }

    newIndex++;
    size++;
  }

  @Override
  public void add(int index,T element)
  {
    if(index >= 0 && index < newIndex)
    {
      Node<T> newEl = new Node<>(index,element);
      if(Math.abs(newIndex - 1 - index) < index)
      {
        Node<T> curren = last;
        while(curren != null)
        {
          if(curren.getPosIndex() == index)
          {
            curren.getPreviosNode().setNextNode(newEl);
            newEl.setPreviosNode(curren.getPreviosNode());
            newEl.setNextNode(curren);
            curren.setPreviosNode(newEl);
            while(curren != null)
            {
              curren.setPosIndex(curren.getPosIndex() + 1);
              curren = curren.getNextNode();
            }
            newIndex++;
            size++;
            return;
          }//end iner if
          curren = curren.getPreviosNode();
        }
      }else
      {
        Node<T> curren = first;
        while(curren != null)
        {
          if(curren.getPosIndex() == index)
          {
            curren.getPreviosNode().setNextNode(newEl);
            newEl.setPreviosNode(curren.getPreviosNode());
            newEl.setNextNode(curren);
            curren.setPreviosNode(newEl);
            while(curren != null)
            {
              curren.setPosIndex(curren.getPosIndex() + 1);
              curren = curren.getNextNode();
            }
            newIndex++;
            size++;
            return;
          }//end iner if

          curren = curren.getNextNode();
        }
      }
    }//end if
  }

  @Override
  public void clear()
  {
    first = null;
    last = null;
    newIndex = 0;
    size = 0;
  }

  @Override
  public T get(int index)
  {
    if(index >= 0 && index < newIndex)
    {
      if(Math.abs(newIndex - 1 - index) < index)
      {
        Node<T> curren = last;
        while(curren != null)
        {
          if(curren.getPosIndex() == index)
          {
            return curren.getElement();
          }

          curren = curren.getPreviosNode();
        }//end whiel
      }else
      {
        Node<T> curren = first;
        while(curren != null)
        {
          if(curren.getPosIndex() == index)
          {
            return curren.getElement();
          }

          curren = curren.getNextNode();
        }//end while
      }//end else in if/else
    }
    return null;
  }

  @Override
  public int indexOf(T element)
  {
    Node<T> curren = first;
    while(curren != null)
    {
      if(curren.getElement().equals(element))
      {
        return curren.getPosIndex();
      }

      curren = curren.getNextNode();
    }
    return -1;
  }

  @Override
  public T remove(int index)
  {
    if(Math.abs(newIndex - 1 - index) < index)
    {
      Node<T> curren = last;
      while(curren != null)
      {
        if(curren.getPosIndex() == index)
        {
          Node<T> temp = curren;
          curren.getPreviosNode().setNextNode(curren.getNextNode());
          curren.getNextNode().setPreviosNode(curren.getPreviosNode());
          curren = curren.getNextNode();
          while(curren != null)
          {
            curren.setPosIndex(curren.getPosIndex() - 1);
            curren = curren.getNextNode();
          }
          newIndex--;
          size--;
          return temp.getElement();
        }

        curren = curren.getPreviosNode();
      }
    }else
    {
      Node<T> curren = first;
      while(curren != null)
      {
        if(curren.getPosIndex() == index)
        {
          Node<T> temp = curren;
          curren.getPreviosNode().setNextNode(curren.getNextNode());
          curren.getNextNode().setPreviosNode(curren.getPreviosNode());
          curren = curren.getNextNode();
          while(curren != null)
          {
            curren.setPosIndex(curren.getPosIndex() - 1);
            curren = curren.getNextNode();
          }
          newIndex--;
          size--;
          return temp.getElement();
        }

        curren = curren.getNextNode();
      }
    }
    return null;
  }

  @Override
  public T set(int index,T element)
  {
    if(index >= 0 && index < newIndex)
    {
      if(Math.abs(newIndex - 1 - index) < index)
      {
        Node<T> curren = last;
        while(curren != null)
        {
          if(curren.getPosIndex() == index)
          {
            T res = curren.getElement();
            curren.setElement(element);
            return res;
          }

          curren = curren.getPreviosNode();
        }//end whiel
      }else
      {
        Node<T> curren = first;
        while(curren != null)
        {
          if(curren.getPosIndex() == index)
          {
            T res = curren.getElement();
            curren.setElement(element);
            return res;
          }

          curren = curren.getNextNode();
        }//end while
      }//end else in if/else
    }
    return null;
  }

  @Override
  public int size()
  {
    return size;
  }

  @Override
  public T[] toArray()
  {
    if(size > 0)
    {
      T[] resMas = (T[]) Array.newInstance(first.getElement().getClass(),size);
      Node<T> current = first;
      int iter = 0;
      while(current != null)
      {
        resMas[iter] = current.getElement();
        current = current.getNextNode();
        iter++;
      }

      return resMas;
    }
    return null;
  }

  @Override
  public Iterator<T> iterator()
  {
    return new ListIterator<T>(first);
  }

}
