java.util.Arrays;
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
        {
                int i=0;
                int j=1;
                {
                    for (i = 0; i < j-1; i++)

                        // Last i elements are already in place
                        for (j = 0; j < j-i-1; j++)
                            if (arr[j] > arr[j+1])
                                minimumIndex(arr, j);

                }
            }
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
        class BubbleSort {
            public void bubbleSort(int[] Arr) {
                int temp;
                int j;
                for (j = 0; j < Arr.length - 1; j++) {
                    for (int i = 0; i < Arr.length - 1; i++) {
                        if (Arr[i] > Arr[i + 1]) {
                            temp = Arr[i + 1];
                            Arr[i + 1] = Arr[i];
                            Arr[i] = temp;
                        }
                    }
                }
            }
        }

        public static int median(int[],arr[])
        {
            int middle = arr.length / 2;
            int median=0;
            if (arr.length%2==1)
                return median=arr[middle];
            else
                return median=(arr[middle-1]+arr[middle])/2;
            return median;
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

        public static void mergeSort(int[] a, int n) {
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = a[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = a[i];
            }
            mergeSort(l, mid);
            mergeSort(r, n - mid);

            merge(a, l, r, mid, n - mid);
        }
        return 0;

        public static void merge(
        int[] a, int[] l, int[] r, int left, int right) {

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


    }

    @Override
    public String greeting() {
        return null;
    }
}
