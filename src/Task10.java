public class Task10
{
    static int count = 0;
    static int weight = 0;
    public static void AddBall(int w, String color)
    {
        if (color == "blue")
            count++;
        weight += w;   
    }
    public static void main(String[] args)
    {
        System.out.println("Task 10");
        AddBall(3, "blue");
        AddBall(5, "green");
        AddBall(4, "blue");
        System.out.println("Blue balls: " + count);
        System.out.println("Total weight: " + weight);
    }
}