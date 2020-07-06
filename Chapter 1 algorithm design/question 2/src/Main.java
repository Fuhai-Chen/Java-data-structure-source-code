/*
问题描述：见源文件夹问题描述图片

算法分析： 输入： a数组， 数值x
         输出： 结果result
         结果通过for循环累加实现，x的i次方通过累乘实现
 */
public class Main {
    public static double getResult (int[] a, double x){
        double result = 0, X = 1;   //初始化先令X = 1，减少一次累乘，因为第一次累加是乘x的0次方，

        for (int i = 0; i < a.length; i ++){
            result += a[i] * X;
            X *= x;
        }

        return result;
    }
}
