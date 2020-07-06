//测试类
public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(5);
        Complex c2 = new Complex(6, 7);

        System.out.println(c1.getImag());

        c1.setImag(3);
        c1.setReal(3);

        System.out.println(c1.getReal() + "   " + c1.getImag());
        System.out.println(c2.getReal() + "   " + c2.getImag());

        c1.delete(c2);

        System.out.println(c1.getReal() + "   " + c1.getImag());

        c2.multi(c1);

        System.out.println(c2.getReal() + "   " + c2.getImag());

    }
}
