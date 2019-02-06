import java.util.Arrays;

public class sortAManiaTestRunner
{
    public static void main(String[] args)
    {
        SortCompetition team2 = new Team2SortCompetition();
        int[] randIntArr = randIntArr(10000);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team2.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }

    private static void printArr(int[] randIntArr)
    {
        System.out.println(Arrays.toString(randIntArr));
    }

    private static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random() * 10001);
        }
        return arr;
    }
}
