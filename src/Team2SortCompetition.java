public class Team2SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        int num = 10000;
        arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < 5) {
                char c = (char) ((Math.random() * 26) + 97);
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

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        int temp;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }
    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
     @Override
    public int challengeFour(int[][] arr)
    {
        boolean swap = true;
        int[] medianArr = new int[arr.length];
        while(swap)
        {
            swap = false;
            for(int row = 0; row < arr.length; row++)
            {
                for(int col = 0; col < arr[row].length; col++)
                {
                    int i = col - 1;
                    if(arr[row][col] < arr[row][i])
                    {
                        int j = arr[row][col];
                        arr[row][col] = arr[row][i];
                        arr[row][i] = j;
                        swap = true;
                    }
                }
            }
        }

        for(int row = 0; row < arr.length;row++)
        {
            int i = row;
            int x = arr.length/2;
            int y = arr.length/2 - 1;
            medianArr[i] = (arr[row][x] + arr[row][y])/2;
        }

        boolean medianSwap = true;
        while(medianSwap)
        {
            medianSwap = false;
            for(int j = 1; j < arr.length; j++)
            {
                int i = j - 1;
                if(medianArr[j] < medianArr[i])
                {
                    int x = medianArr[i];
                    medianArr[i] = medianArr[j];
                    medianArr[j] = x;
                    medianSwap = true;
                }
            }
        }
        return (medianArr[medianArr.length / 2] + medianArr[(medianArr.length / 2) - 1])/2;
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
