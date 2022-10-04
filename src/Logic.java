import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Stack;

public class Logic {
    public double CalculateFunction1(int x, int y)
    {
        return (1 + pow(sin(x + y), 2)) / (2 + abs(x - (2 * x)/(1 + pow(x*y, 2)))) + x;
    }

    public boolean CheckCoordinates2(int x, int y)
    {
        return (x >= -6 && y >= -3 && x <= 6 && y <= 0) || (x >= -4 && y >= 0 && x <= 4 && y <= 5);
    }

    public double[][] CalculateFunctionTable3(double a, double b, double h)
    {
        int valuesCount = (int)round((b - a) / h) + 1;
        double[][] resultTable = new double[2][valuesCount];
        double x = a;
        double delta = pow(10, -10);
        for (int i = 0; x <= b; x += h, i++)
        {
            resultTable[0][i] = x;
            if ((cos(x) < -delta) || (cos(x) > delta))
                resultTable[1][i] = tan(x);
            else
                resultTable[1][i] = Double.NaN;
        }
        return resultTable;
    }

    public ArrayList<Integer> GetPrimeIndexes4(int[] numbers)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++)
        {
            double sqrt = sqrt(numbers[i]);
            boolean isPrime = true;
            for (int j = 2; j <= sqrt; j++)
            {
                if (numbers[i] % j == 0)
                    isPrime = false;
            }
            if (isPrime)
                result.add(i);
        }
        return result;
    }

    public int MinAmountToDeleteForIncreasingValues5( int arr[] )
    {
        int n = arr.length;
        int result = 0;
        int[] lis = new int[n];

        for (int i = 0; i < n; i++ )
            lis[i] = 1;
     
        for (int i = 1; i < n; i++ )
            for (int j = 0; j < i; j++ )
                if ( arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
     
        for (int i = 0; i < n; i++ )
            if (result < lis[i])
                result = lis[i];
     
        return n - result;
    }

    public int[][] GetMatrix6(int[] numbers)
    {
        int length = numbers.length;
        int[][] resultMatrix = new int[length][length];
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++)
                resultMatrix[i][j] = numbers[(i + j) % length];
        return resultMatrix;
    }

    public void ShellSort7(int[] numbers)
    {
        int length = numbers.length, i = 1;
        while (i < length)
        {
            if (numbers[i - 1] > numbers[i])
            {
                int temp = numbers[i];
                numbers[i] = numbers[i - 1];
                numbers[i - 1] = temp;
                if (i > 1)
                    i--;
            }
            else
                i++;
        }
    }

    private int MAX = 999999;
    private void FillStack(Stack<Integer> result, int[] array)
    {
        result.push(MAX);
        int length = array.length;
        for (int i = 0; i < length; i++)
            result.push(array[length - i - 1]);

    }

    public ArrayList<Integer> InsertionsForIncreasingValues8(int[] a, int[] b)
    {
        Stack<Integer> initialArray = new Stack<>();
        FillStack(initialArray, a);
        Stack<Integer> insertingArray = new Stack<>();
        FillStack(insertingArray, b);
        ArrayList<Integer> result = new ArrayList<>(); 
        int insertionIndex = 0;
        int count = a.length + b.length;
        for (int i = 0; i < count; i++)
        {
            if (initialArray.peek() < insertingArray.peek())
            {
                initialArray.pop();
            }
            else
            {
                insertingArray.pop();
                result.add(insertionIndex);
            }
            insertionIndex++;
        }
        return result;
    }

    public void PrintBasketInfo9(Basket basket)
    {
        
    }
}
