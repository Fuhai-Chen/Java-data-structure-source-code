//给出将整型数组a中数据元素实现就地逆置的算法
//所谓就地逆置，就是利用数组a原有空间来存放数组a中逆序排放后的各个数据元素。
public class Main {
    public static void reverse(int [] a){
        int n = a.length;   //求长度
        int temp;   //中间介质元素
        for (int i = 0, j = n - 1; i < j;i ++, j --){   //分别自首尾开始取元素，对应相交换
            temp = a[i];    //交换值通过中介元素实现
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
//首先将第0个元素与第n-1个元素置换，再依次类推
