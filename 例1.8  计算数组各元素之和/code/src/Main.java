//数组各元素求和
public class Main {
    public static int sum(int[] a){
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i ++){   //利用for循环累加
            sum += a[i];
        }
        return sum;
    }
}
