//顺序表类的描述

public class SqList implements Ilist {

    private Object[] listElem;  //申请存储空间
    private int curLen; //线性表的当前长度

//    构造函数,构造一个存储空间容量为maxSize的线性表
    public SqList(int maxSize) {
        curLen = 0;     //置顺序表的当前长度为0
        listElem = new Object[maxSize];     //为顺序表分配maxSize个存储单元
    }

//    置空
    public void clear() {
        curLen = 0;     //当前长度置为0
    }

//    判断是否为空
//    ！！！！！注意：（这里直接return curlen是否为0即可，不需要再使用if语句）
    public boolean isEmpty() {
        return curLen == 0;
    }

//    求链表长度(元素个数)
    public int length() {
        return curLen;      //直接return curLen即可
    }

//    获取第i个元素
//    算法分析：读取第i（i为下标）个元素并返回其值，其中i的取值范围为 0 <= i <= curLen - 1，若不在此范围则抛出异常
    public Object get(int i) throws Exception {
        if (i < 0 || i > curLen - 1)
            throw new Exception("第" + i + "个元素不存在");
        return listElem[i];
    } 

//    在第i个元素之前插入值为x的元素
    public void insert(int i, Object x) throws Exception {
        if (curLen == listElem.length)  //判断顺序表是否已满
            throw new Exception("顺序表已满");   //抛异常
        if (i < 0 || i > curLen)    //判断插入位置是否合法(因为要实现在表尾插入元素，故 i > curLen 为判断条件)
            throw new Exception("插入位置不合法");
        for (int j = curLen; j > i; j --){  //  插入位置及其之后的所有元素后移一位（从后向前遍历元素依次向后移动）
            listElem[j] = listElem[j - 1];
        }
        listElem[i] = x;    //插入x
        curLen ++;      //表长加1

    }

//    删除并返回第i个元素
    public Object remove(int i) throws Exception {
        if (i < 0 || i > curLen - 1)    //i不合法
            throw new Exception("删除位置不合法");
        Object del = listElem[i];   //获取被删除元素
        for (int j = i; j < curLen - 1; j ++)   //被删除元素之后的元素向前移动
            listElem[j] = listElem[j + 1];
        curLen --;      //表长减1
        return del;     //返回被删除元素
    }

    public int indexOf(Object x) {
        int j = 0;  //数组下标初始化
        while (j < curLen && !listElem.equals(x))       //依次比较
            j ++;
        if (j < curLen)     //判断j的位置是否位于顺序表中
            return j;       //返回值为x的数据元素在顺序表中的位置
        else                //值为x的元素在顺序表中不存在
            return -1;
    }

    public void display() {
        for (int i = 0; i < curLen; i ++){      //for循环遍历所有元素
            System.out.print(listElem[i] + "  ");
        }
        System.out.println();
    }
}
