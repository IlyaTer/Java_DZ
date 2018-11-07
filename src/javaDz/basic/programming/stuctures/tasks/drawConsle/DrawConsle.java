package javaDz.basic.programming.stuctures.tasks.drawConsle;

public class DrawConsle
{
  public static void drawRectangle(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        System.out.print("#");
      }//end j for
      System.out.println();
    }//end i for
  }//end drawRectangle

  public static void drawTriangleA(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= i; j++)
      {
        System.out.print("#");
      }//end j for
      System.out.println();
    }//end i for
  }

  public static void drawTriangleB(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size + 1 - i; j++)
      {
        System.out.print("#");
      }//end j for
      System.out.println();
    }//end i for
  }

  public static void drawTriangleC(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        if(j < i)
        {
          System.out.print(" ");
        }
        else
        {
          System.out.print("#");
        }
      }//end j for
      System.out.println();
    }//end i for
  }

  public static void drawTriangleD(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        if(j >= size- i + 1)
        {
          System.out.print("#");
        }
        else
        {
          System.out.print(" ");
        }
      }//end j for
      System.out.println();
    }//end i for
  }

  public static void drawRectangleE(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        if(j == 1 || j == size || i == 1 || i == size)
        {
          System.out.print("#");
        }
        else
        {
          System.out.print(" ");
        }
      }//end j for
      System.out.println();
    }//end i for
  }//end drawRectangleE

  public static void drawRectangleF(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        if(j == i || i == 1 || i == size)
        {
          System.out.print("#");
        }
        else
        {
          System.out.print(" ");
        }
      }//end j for
      System.out.println();
    }//end i for
  }//end drawRectangleF

  public static void drawRectangleG(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        if(j ==size - i +1 || i == 1 || i == size)
        {
          System.out.print("#");
        }
        else
        {
          System.out.print(" ");
        }
      }//end j for
      System.out.println();
    }//end i for
  }//end drawRectangleG

  public static void drawRectangleH(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        if(j ==size - i +1 || j == i || i == 1 || i == size)
        {
          System.out.print("#");
        }
        else
        {
          System.out.print(" ");
        }
      }//end j for
      System.out.println();
    }//end i for
  }//end drawRectangleH

  public static void drawRectangleI(int size)
  {
    for(int i = 1; i <= size ; i++)
    {
      for(int j = 1; j <= size; j++)
      {
        if(j ==size - i +1 || j == i || i == 1 || i == size ||
                j == 1 || j == size)
        {
          System.out.print("#");
        }
        else
        {
          System.out.print(" ");
        }
      }//end j for
      System.out.println();
    }//end i for
  }//end drawRectangleI

  public static void demonstrationFunc(int size)
  {
    System.out.println("first");
    drawRectangle(size);
    System.out.println("a)");
    drawTriangleA(size);
    System.out.println("b)");
    drawTriangleB(size);
    System.out.println("c)");
    drawTriangleC(size);
    System.out.println("d)");
    drawTriangleD(size);
    System.out.println("e)");
    drawRectangleE(size);
    System.out.println("f)");
    drawRectangleF(size);
    System.out.println("g)");
    drawRectangleG(size);
    System.out.println("h)");
    drawRectangleH(size);
    System.out.println("i)");
    drawRectangleI(size);
  }

  public static void main(String[] args)
  {
    demonstrationFunc(15);
  }
}
