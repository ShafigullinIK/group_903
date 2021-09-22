public class Complex {

    double re;
    double im;

    public static Complex sum(Complex a, Complex b) {
        Complex c = new Complex();
        c.re = a.re + b.re;
        c.im = a.im + b.im;
        return c;
    }

}
