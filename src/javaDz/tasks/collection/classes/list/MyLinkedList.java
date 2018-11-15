package javaDz.tasks.collection.classes.list;

import javaDz.tasks.collection.interfaces.ILinkedKist;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements ILinkedKist<T>
{
  private int newIndex = 0;
  private int size = 0;
  private Node<T> first;
  private Node<T> last;

  @Override
  public void add(T element)
  {
    if(first == null)
    {
      first = last = new Node<T>(element);
      newIndex++;
      size++;
    }else
    {
      Node<T> temp = new Node<T>(element);
      last.setNextNode(temp);
      temp.setPreviosNode(last);
      last = temp;
      newIndex++;
      size++;
    }
  }

  @Override
  public void add(int index,T element)
  {
    if(index >= 0 && index < newIndex)
    {
      Node<T> newEl = new Node<>(element);
      if(Math.abs(newIndex - 1 - index) < index)
      {
        Node<T> curren = last;
        int iter = newIndex - 1;
        while(curren != null)
        {
          if(iter == index)
          {
            curren.getPreviosNode().setNextNode(newEl);
            newEl.setPreviosNode(curren.getPreviosNode());
            newEl.setNextNode(curren);
            curren.setPreviosNode(newEl);
            newIndex++;
            size++;
            return;
          }//end iner if
          curren = curren.getPreviosNode();
          iter--;
        }//end while
      }else
      {
        Node<T> curren = first;
        int iter = 0;
        while(curren != null)
        {
          if(iter == index)
          {
            curren.getPreviosNode().setNextNode(newEl);
            newEl.setPreviosNode(curren.getPreviosNode());
            newEl.setNextNode(curren);
            curren.setPreviosNode(newEl);
            newIndex++;
            size++;
            return;
          }//end iner if
          curren = curren.getNextNode();
          iter++;
        }//end while
      }
    }//end if
  }

  @Override
  public void clear()
  {
    first = last = null;
    size = 0;
    newIndex = 0;
  }

  @Override
  public T get(int index)
  {
    if(index >= 0 && index < newIndex)
    {
      if(Math.abs(newIndex - 1 - index) < index)
      {
        Node<T> curren = last;
        int iter = newIndex - 1;
        while(curren != null)
        {
          if(iter == index)
          {
            return curren.getElement();
          }

          curren = curren.getPreviosNode();
          iter--;
        }//end whiel
      }else
      {
        Node<T> curren = first;
        int iter = 0;
        while(curren != null)
        {
          if(iter == index)
          {
            return curren.getElement();
          }

          curren = curren.getNextNode();
          iter++;
        }//end while
      }//end else in if/else
    }
    return null;
  }

  @Override
  public int indexOf(T element)
  {
    int index = 0;
    if (element == null) {
      for (Node<T> x = first; x != null; x = x.nextNode) {
        if (x.element == null)
          return index;
        index++;
      }
    } else {
      for (Node<T> x = first; x != null; x = x.nextNode) {
        if (element.equals(x.element))
          return index;
        index++;
      }
    }
    return -1;
  }

  @Override
  public T remove(int index)
  {
    if(Math.abs(newIndex - 1 - index) < index)
    {
      Node<T> curren = last;
      int iter = newIndex - 1;
      while(curren != null)
      {
        if(iter == index)
        {
            Node<T> temp = curren;
            if(index == newIndex - 1)
            {
              curren.getPreviosNode().setNextNode(null);
              last = curren.getPreviosNode();
            }
            else
            {
              curren.getPreviosNode().setNextNode(curren.getNextNode());
              curren.getNextNode().setPreviosNode(curren.getPreviosNode());
              curren = curren.getNextNode();
            }

          newIndex--;
          size--;
          return temp.getElement();
        }

        curren = curren.getPreviosNode();
        iter--;
      }
    }
    else
    {
      Node<T> curren = first;
      int iter = 0;
      while(curren != null)
      {
        if(iter == index)
        {
          Node<T> temp = curren;
          if(index == 0)
          {
            curren.getNextNode().setPreviosNode(null);
            first = curren.getNextNode();
          }
          else
          {
            curren.getPreviosNode().setNextNode(curren.getNextNode());
            curren.getNextNode().setPreviosNode(curren.getPreviosNode());
            curren = curren.getNextNode();
          }

          newIndex--;
          size--;
          return temp.getElement();
        }

        curren = curren.getNextNode();
        iter++;
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
        int iter = newIndex - 1;
        while(curren != null)
        {
          if(iter == index)
          {
            T res = curren.getElement();
            curren.setElement(element);
            return res;
          }

          curren = curren.getPreviosNode();
          iter--;
        }//end whiel
      }else
      {
        Node<T> curren = first;
        int iter = 0;
        while(curren != null)
        {
          if(iter == index)
          {
            T res = curren.getElement();
            curren.setElement(element);
            return res;
          }

          curren = curren.getNextNode();
          iter++;
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
  //todo переделать реализацию
  @Override
  public Object[] toArray()
  {
    if(size > 0)
    {
      Node<T> current = first;
      T[] resMas = (T[]) Array.newInstance(Object.class,size); ;
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

    return new Iterator<T>()
    {
      private Node<T> current = first;

      @Override
      public boolean hasNext()
      {
        if(current != null)
        {
          return true;
        }
        return false;
      }

      @Override
      public T next()
              throws NoSuchElementException
      {
        if(current == null)
        {
          throw new NoSuchElementException();
        }
        Node<T> temp = current;
        current = current.getNextNode();
        return temp.getElement();
      }
    };//end anonim class
  }

}
