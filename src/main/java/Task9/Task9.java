package main.java.Task9;

public class Task9 {
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Double.hashCode(re);
            result = prime * result + Double.hashCode(im);
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o==null || getClass() != o.getClass())
                return false;
            ComplexNumber other = (ComplexNumber) o;
            return (im == other.getIm()) && (re == other.getRe());
        }
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(2, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
    }
}
