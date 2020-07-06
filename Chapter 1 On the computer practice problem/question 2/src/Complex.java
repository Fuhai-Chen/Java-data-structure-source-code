/*
问题描述：
2. 设计一个复数类，要求：
	（1）在复数内部用双精度浮点数定义其实部和虚部。
	（2）实现3个构造函数，第一个无参，第二个只有实部参数，第三个实部和虚部
	（3）编写获取和修改复数的实部和虚部的成员函数
	（4）编写实现复数的减法、乘法运算的成员函数
	（5）测试主函数
 */


public class Complex {
    //成员变量 实部与虚部
    private double real;
    private double imag;

    //构造函数
    public Complex(){ }

    public Complex(double real){
        this.real = real;
        imag = 0;
    }

    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    //获取实部
    public double getReal(){
        return real;
    }

    //获取虚部
    public double getImag(){
        return imag;
    }

    //设置实部
    public void setReal(double real) {
        this.real = real;
    }

    //设置虚部
    public void setImag(double imag) {
        this.imag = imag;
    }

    //减法运算
    public void delete(Complex a){
        real -= a.real;
        imag -= a.imag;
    }

    //乘法运算
    public void multi(Complex a){
        real = real * a.real - imag * a.imag;
        imag = imag * a.real + real + a.imag;
    }
}
