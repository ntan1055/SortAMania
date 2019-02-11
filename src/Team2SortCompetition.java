public class Team2SortCompetition extends SortCompetition {

    public static void swap(int list[], int i, int j)
    {
        int temp= list[i];
        list[i]=list[j];
        list[j]=temp;
    }

    public static int minimumIndex(int list[], int ind)
    {
        int minInd = ind;
        for (int i = ind; i <list.length; i++)
        {
            if (list[i] < list[minInd])
            {
                swap(list,i,minInd);
                minInd = i;
            }
        }
        return minInd;
    }

    @Override
    public int challengeOne(int[] arr)
    {
        boolean swap = true;
        while(swap)
        {
            swap = false;
            for(int j = 1; j < arr.length; j++)
            {
                int i = j - 1;
                if(arr[j] < arr[i])
                {
                    swap(arr, i, j);
                    swap = true;
                }
            }
        }
        return median(arr);
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
        return true;
    }

    @Override
    public int challengeThree(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return median(arr);
    }

    public static int median(int[] arr)
    {
        int middle = arr.length / 2;
        int median;
        if (arr.length%2==1)
            median=arr[middle];
        else
            median=(arr[middle-1]+arr[middle])/2;
        return median;
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
                for(int col = 1; col < arr[row].length; col++)
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



    public static void merge(int[] a, int[] l, int[] r, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    @Override
    public String greeting() {
        return null;
    }
}
