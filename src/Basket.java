import java.util.ArrayList;

public class Basket {
    ArrayList<Ball> balls;
    public Basket()
    {
        balls = new ArrayList<Ball>();
    }
    public Basket(ArrayList<Ball> balls)
    {
        this.balls = balls;
    }
    public int GetTotalWeight()
    {
        int result = 0;
        for (Ball ball : balls) {
            result += ball.weight;
        }
        return result;
    }

    public int GetColorAmount(String color)
    {
        int result = 0;
        for (Ball ball : balls) {
            result += (ball.color == color ? 1 : 0);
        }
        return result;
    }

    
}
