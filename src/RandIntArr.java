public class RandIntArr
{
    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random() * 10001);
        }
        return arr;
    }
}
