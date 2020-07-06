public interface IComplex {
    public double getReal();    //取实部
    public void setReal(double real);   //修改实部
    public double getImag();    //取虚部
    public void setImag(double imag);   //修改虚部
    public void add(IComplex Z);    //两个复数的求和，注意求和时形参是复数本身！！！
}
