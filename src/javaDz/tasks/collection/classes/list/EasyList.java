package javaDz.tasks.collection.classes.list;

class EasyList
{
  private Node<Integer> first;
  private Node<Integer> last;

  public void add(int el)
  {
    if(first == null && last == null)
    {
      first = new Node<Integer>(el);
      last = first;
    }
    else
    {
      Node<Integer> temp = new Node<Integer>(el);
      last.setNextNode(temp);
      temp.setPreviosNode(last);
      last = temp;
    }//end if/else
  }

  public void remove()
  {
    if(first != null && last != null)
    {
      last.getPreviosNode().setNextNode(null);
      last = last.getPreviosNode();
    }
  }//end remove

  public Node<Integer> getFirst()
  {
    return first;
  }

  public Node<Integer> getLast()
  {
    return last;
  }

}
