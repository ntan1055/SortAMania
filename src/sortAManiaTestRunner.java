import java.util.Arrays;

public class sortAManiaTestRunner
{
    public static void main(String[] args)
    {
        SortCompetition team2 = new Team2SortCompetition();
        int[] randIntArr = RandIntArr.randIntArr(10000);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = Team2SortCompetition.challengeOne(randIntArr);
    }

    private static void printArr(int[] randIntArr)
    {
        System.out.println(Arrays.toString(randIntArr));
    }
}
