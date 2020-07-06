public class Complex implements IComplex{

    //成员变量定义
    private double real;    //实部
    private double imag;    //虚部

    //不要忘了构造函数！！！！！
    public Complex (double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    //取实部
    public double getReal() {
        return real;
    }

    //修改实部
    public void setReal(double real) {
        this.real = real;
    }

    //取虚部
    public double getImag() {
        return imag;
    }

    //修改虚部
    public void setImag(double imag) {
        this.imag = imag;
    }

    //两个复数求和操作！！！！！
    //给定一个复数（形参），加到已知复数（方法调用者）上
    public void add(IComplex Z) {
        if (Z != null){     //若Z不为空，则虚部实部分别相加
            real += Z.getReal();    //相加时仍调用getReal函数
            imag += Z.getImag();
        }
    }
}
