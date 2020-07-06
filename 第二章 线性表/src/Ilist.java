//线性表接口描述
public interface Ilist {
    public void clear();    //置空
    public boolean isEmpty();   //判断是否为空
    public int length();    //求长度
    public Object get(int i) throws Exception;   //获取第i个元素
    public void insert(int i, Object x) throws Exception;    //插入元素
    public Object remove(int i) throws Exception;    //删除并返回第i个元素
    public int indexOf(Object x);   //返回首次出现该元素的位序号
    public void display();  //输出各值
}
