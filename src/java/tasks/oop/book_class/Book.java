package java.tasks.oop.book_class;

import java.util.Arrays;

public class Book
{
  private String name;
  private Author[] authors;
  private double price;
  private int qty = 0;

  public Book(String name,Author[] authors,double price)
  {
    this.name = name;
    this.authors = authors;
    this.price = price;
  }

  public Book(String name,Author[] authors,double price,int qty)
  {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String getName()
  {
    return name;
  }

  public Author[] getAuthors()
  {
    return authors;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public int getQty()
  {
    return qty;
  }

  public void setQty(int qty)
  {
    this.qty = qty;
  }

  public String getAuthorNames()
  {
    String authorNames = "";

    for(int i = 0; i < authors.length; i++)
    {
      authorNames += authors[i].getName();
      if(i == authors.length - 1)
      {
        continue;
      }
      authorNames += ",";
    }

    return authorNames;
  }

  @Override
  public String toString()
  {
    return "Book[" +
            "name='" + name +
            ", authors=" + Arrays.toString(authors) +
            ", price=" + price +
            ", qty=" + qty +
            ']';
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof Book))
    {
      return false;
    }
    Book book = (Book) obj;

    return name.equals(book.name) &&
            Arrays.equals(authors, book.authors) &&
            Double.compare(price, book.price) == 0 &&
            qty == book.qty;
  }

  @Override
  public int hashCode()
  {
    int result = 17;

    result = 31 * result + name.hashCode();
    for(Author a : authors)
    {
      result = 31 * result + a.hashCode();
    }
    long promField = Double.doubleToLongBits(price);
    result = 31 * result + (int) (promField ^ (promField >>> 32));
    result = 31 * result + qty;

    return result;
  }

}
