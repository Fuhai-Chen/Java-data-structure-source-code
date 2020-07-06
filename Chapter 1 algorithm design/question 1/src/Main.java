/*
问题描述：
1. 有一个包括100个数据元素的数组，每个数据元素的值都是实数，试编写一个求最大数据元素的值及其下标的算法，并分析算法的时间复杂度。
 */

public class Main {
    public static void max (double []a){    //因为题目指明每个数据元素的值为实数，所以用double
        if (a.length == 100){
            double max = a[0];  //初始化最大值为数组中的第一个元素，不应该设置为0
            int index = 0;
            for (int i = 0; i < 100; i ++){
                if (a[i] > max){
                    max = a[i];
                    index = i;
                }
            }
            System.out.println("数组中最大实数为： " + max);
            System.out.println("其在数组中的下标为： " + index);
        }
        else
            System.out.println("请输入包含100数据元素的数组");
    }
}
/*
算法分析：
    时间复杂度 O (n), n 为数组长度？ 或是 O (1) ，因为数组长度已确定
 */
