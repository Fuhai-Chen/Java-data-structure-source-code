//问题描述：
//    在一个含有n个数据元素的数组a中删除第i（0 <= i <= n-1）个位置上的数组元素，并求该算法的时间复杂度

public class Main {

    public static void delete(int a[], int n, int i){
        if (i < 1 || i > n) {
            System.out.println("FALSE");   //  不符合规则的参数，返回删除失败
            System.exit(0); //终止程序
        }
        for (;i < n; i ++){
            a[i - 1] = a[i];
        }
        System.out.println("OK");

    }


    //测试代码
    public static void main (String [] args){
        int[] b = {1,2,3,4,5,6,7};

        delete(b, 7, 4);

        for (int m = 0; m < b.length; m ++){
            System.out.print(b[m] + "  ");

        }
    }
}
