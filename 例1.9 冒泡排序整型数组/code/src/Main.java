//冒泡排序！！！
public class Main {
//    第一种方法 （给定参数：需排序的数组，数组元素个数）
    public static void bubbleSort_1 (int[] a, int n){
        int temp, flag = 1;     //flag作为是否已排序的标志
        for (int i = 1; i < n && flag == 1; i ++){  //n个元素，进行n次冒泡
            flag = 0;
            for (int j = 0; j < n - i; j ++){   //for循环实现选中元素到n-i个位置的冒泡（比较），后i个元素已实现冒泡无需再比较
//                原因解释，冒泡排序完成每次冒泡后，就有一元素已经冒泡到顶端位置，因此下次冒泡时无需再比较
                if (a[j] > a[j + 1]){
                    flag = 1;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }


//    第二种方法 （给定参数：需排序的数组）
    public static void bubbleSort_2 (int a[]){  //数组也可这样表示，详见底端
        for (int i = 0; i < a.length - 1; i ++){    //n个元素，进行n次冒泡，此时数组的长度直接通过a.length获取（下同）
            for (int j = 0; j < a.length - 1 - i; j ++){    //实现相邻元素的比较
                if (a [j] > a [j + 1]){
                    int temp = a[j];
                    a[j] = a [j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }


//    第三种方法
    public static void bubbleSort_3 (int[] a, int n){
        //如果排序数组规模小于等于1，直接返回
        if (n <= 1){
            return;
        }
        //有n个元素，进行n次冒泡
        for (int i = 0; i < n; i ++){
//            每一次冒泡比较交换相邻两个元素
            for (int j = 0; j < n - i - 1; j ++){
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

//Java中定义数组的几种方式！！！！
//        1. int[] a
//
//        2. int a[]
//
//        3. int[] a={1,2,3,4,5,6,7}


