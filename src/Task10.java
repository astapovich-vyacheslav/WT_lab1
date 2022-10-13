import java.util.ArrayList;
public class Task10
{
    public static void main(String[] args)
    {
        System.out.println("Task 10");
        ArrayList<Ball> balls = new ArrayList<Ball>();
        balls.add(new Ball(3, "blue"));
        balls.add(new Ball(5, "green"));
        balls.add(new Ball(4, "blue"));
        Basket basket = new Basket(balls);
        System.out.println("Blue balls: " + basket.GetColorAmount("blue"));
        System.out.println("Total weight: " + basket.GetTotalWeight());
    }
}