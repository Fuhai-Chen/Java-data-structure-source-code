/*
问题描述：
    1. 编写一个实现将整型数组中的数据元素按值递增的顺序进行排序的程序

算法分析：
    输入： 整型数组       输出：排序后的数组
    冒泡排序？？？
 */

public class Main {
    public static void sort(int[] a){
        int temp, n = a.length;
        for (int i = 0; i < n; i ++){
            for (int j = 0; j <  n - i; j ++){
                if (a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
