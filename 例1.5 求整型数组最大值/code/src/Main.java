public class Main {
    public static int maxEle(int [] a){
        int n = a.length;   //获取数组长度，用于for循环遍历
        int max = a[0]; //先将数组第一个设为最大值
        for (int i = 1; i < n; i ++){   //遍历整个数组
            if (max < a[i]) //比较，若比较值大，则代替最大值
                max = a[i];
        }
        return max;
    }
}
