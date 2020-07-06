/*
问题描述：
        给定一整数序列A1,A2,A3,...,An(可能有负数)，求A1~An的一个子序列Ai~Aj,使得Ai~Aj的和最大。
 */

public class Main {

//    第一种方法：穷举所有子序列，利用循环比较，依次求出所有子序列的和再取最大的那个
//    算法分析：输入（形参）为数组，输出（返回值）为最大值    复杂度 O(n三次方)
    public static int maxSub_1 (int[] a){
        int max = 0, n = a.length, sum = 0;
//      第一重循环执行一次则计算出长度为i的所有子序列的和的最大值
        for (int i = 1; i <= n; i ++)   //遍历子序列长度
            for (int j = 0; j < n; j ++){   //遍历子序列起点
                sum = 0;
                for (int k = j; k < j + i && k < n; k ++)   //累加求和
                    sum += a[k];
                if (sum > max)  //与现有最大值比较，若累加和大于最大值，则替换
                    max = sum;
            }
        return max;
    }


//    第二种方法：确定子序列起始点，然后不断向后累加并比较
//    算法分析：输入输出不变，但通过递推，子序列的和并不需要每次都重新计算一遍。
//          假设Sum(i,j)为Ai到Aj的和，那么Sum(i,j+1) = Sum(i,j) + A j+1。
//    利用此递推，可撤除一个for循环从而改进算法        复杂度 O(n二次方)
    public static int maxSub_2 (int[] a){
        int max = 0, sum = 0,n = a.length;
        for (int i = 0; i < n; i ++){   //遍历子序列的起点的下标
            sum = 0;
            for (int j = i; j < n; j ++){   //  向后进行累加，每次累加过后都比较
                sum += a[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }

//    第三种方法：动态规划        算法复杂度 O(n)
//    算法分析：
//    对数组扫描一边即可完成操作。它在从左到右扫描过程中记录当前子序列的和sum。
//    （1）若这个和不断增加，那么最大子序列的和max也不断增加，则需不断更新max
//    （2）若往前扫描中遇到负数，则sum会减小，此时sum小于max，则max不进行更新
//    （3）若sum降到0；则扫描的这一段已经无意义，将这一段抛弃，sum重置为0；
//    （4）继续对剩下队列进行分析，直至扫描结束。
    public static int maxSub_3 (int[] a){
        int max = 0, sum = 0, n = a.length;
        for (int i = 0; i < n; i ++){   //从左到右扫描过程中记录当前子序列的和sum
            sum += a[i];
            if (sum > max)      //判断大小
                max = sum;
            else if (sum < 0)   //sum小于0时，抛弃，重置sum为0。
                sum = 0;
        }
        return max;
    }


//    第四种方法：递归（俺也不会）

    public static int maxSum (int[] a, int left, int right){
        if (left == right)
            if (a [left] > 0)
                return a[left];
            else
                return 0;
        int mid = (left + right) / 2;
        int maxLeftSum = maxSum(a, left, mid);
        int maxRightSum = maxSum(a, mid + 1, right);
        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = mid; i >= left; i --){
            leftBorderSum += a[i];
            if (leftBorderSum > maxLeftBorderSum)
                maxLeftBorderSum = leftBorderSum;
        }
        int maxRightBorderSum = 0,rightBorderSum = 0;
        for (int i = mid + 1; i <= right; i ++){
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum)
                maxRightBorderSum = rightBorderSum;
        }
        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
    }

    public static int max3 (int a, int b, int c){
        int max = a > b ? a:b;
        max = max > c ? max:c;
        return max;
    }

    public static int maxSub_4 (int []a){
        return maxSum(a, 0, a.length - 1);
    }
    
}
