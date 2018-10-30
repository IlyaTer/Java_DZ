package Java_tasks_OOP_2.ball_class;

public class Main
{
  public static void main(String[] args)
  {
    Ball ball = new Ball(4, 4, 3, 1, 2);
    Container container = new Container(0,0,10, 10);
    System.out.println(container.collides(ball));
    for(int i = 0; i < 4; i++)
    {
      ball.move();
    }
    System.out.println(container.collides(ball));
  }
}
