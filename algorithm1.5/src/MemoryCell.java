public class MemoryCell {
    private Object storeValue;  //成员变量数据类型为泛型

//    两个方法（赋值和读取）
    public Object get() {
        return storeValue;
    }

    public void set(Object x) {
        this.storeValue = x;
    }
}   //MemoryCell类描述结束
