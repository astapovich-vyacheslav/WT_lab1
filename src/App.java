import java.util.ArrayList;

public class App {

    public static void PrintArray (int[] array)
    {
        for (int num : array)
        {
            System.out.print(num + " ");    
        }
        System.out.println();
    }

    public static void PrintList (ArrayList<Integer> array)
    {
        for (int num : array)
        {
            System.out.print(num + " ");    
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Logic logic = new Logic();
        //Task 1
        System.out.println("Task 1");
        System.out.println(logic.CalculateFunction1(5, 10));

        //Task 2
        System.out.println("Task 2");
        System.out.println("x = 4, y = -1, result: " + logic.CheckCoordinates2(4, -1));
        System.out.println("x = -6, y = 3, result: " + logic.CheckCoordinates2(-6, 3));

        //Task 3
        System.out.println("Task 3");
        double[][] table = logic.CalculateFunctionTable3(-10, 15, 2.5);
        for (int i = 0; i < (int)table[0].length; i++)
        {
            System.out.println(String.format("x = %.3f  F(x) = %.7f", table[0][i], table[1][i]));
        }

        //Task 4
        System.out.println("Task 4");
        int[] numbers = {2, 3, 9, 14, 20, 131, 169, 379};
        ArrayList<Integer> primeIndexes = logic.GetPrimeIndexes4(numbers);
        PrintList(primeIndexes);  

        //Task 5
        System.out.println("Task 5");
        int[] arrayToDeleteElements = {7, 10, 1, 2, 11, 3, 12, 0, 100};
        int amountToDelete = logic.MinAmountToDeleteForIncreasingValues5(arrayToDeleteElements);
        System.out.println(amountToDelete);

        //Task 6
        System.out.println("Task 6");
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = logic.GetMatrix6(numArray);
        for (int i = 0; i < 9 ; i++)
        {
            for (int j = 0; j < 9; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        //Task 7
        System.out.println("Task 7");
        int[] arrayToSort = {2, 7, 5, 9, 9, 0, 1, 2, 7, 4, 3, 8, 6};
        System.out.println("Initial array:");
        PrintArray(arrayToSort);
        logic.ShellSort7(arrayToSort);
        System.out.println("Sorted array");
        PrintArray(arrayToSort);

        //Task 8
        System.out.println("Task 8");
        int[] a = {1, 2, 9}, b = {0, 4, 5, 6, 10};
        ArrayList<Integer> insertions = logic.InsertionsForIncreasingValues8(a, b);
        PrintList(insertions);

        //Task 9
        System.out.println("Task 9");
        ArrayList<Ball> balls = new ArrayList<Ball>();
        balls.add(new Ball(3, "blue"));
        balls.add(new Ball(5, "green"));
        balls.add(new Ball(4, "blue"));
        Basket basket = new Basket(balls);
        System.out.println(basket.GetColorAmount("blue"));
        System.out.println(basket.GetTotalWeight());
    }
}
