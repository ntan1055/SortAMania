public class Team2SortCompetition extends SortCompetition
{
    @Override
    public int challengeOne(int[] arr)
    {
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        int num = 10000;
        arr = new String[num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < 5)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

     @Override
    public int challengeFour(int[][] arr)
    {
        int[] medianArr = new int[arr.length];
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr.length; col++)
            {
                //sort sub arrays
            }
            //median finder here
            //add median to the medianArr
        }
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }
}
