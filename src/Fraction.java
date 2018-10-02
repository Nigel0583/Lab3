public class Fraction {
    private int numerator, denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(int numerator, int denominator){

        setDenominator(denominator);
        setNumerator(numerator);
    }

    public Fraction()
    {
        numerator=0;
        denominator=1;
    }

    public  String toString(){
        return numerator+ "/" +denominator;
    }

    public static Fraction addFraction(Fraction fractionA, Fraction fractionB)
    {
        int d=fractionA.getDenominator()*fractionB.getDenominator();
        int n1, n2;

        n1=(d/fractionA.getDenominator())*fractionA.getNumerator();
        n2=(d/fractionB.getDenominator())*fractionB.getNumerator();

                Fraction addAns = new Fraction(n1+n2,d);
                return addAns;
    }

    public static Fraction subtractFraction(Fraction fractionA, Fraction fractionB)
    {
        int d=fractionA.getDenominator()*fractionB.getDenominator();
        int n1, n2;

                n1=(d/fractionA.getDenominator())*fractionA.getNumerator();
                n2=(d/fractionB.getDenominator())*fractionB.getNumerator();

                Fraction subtractAns = new Fraction(n1-n2,d);
                return subtractAns;
    }

    public static Fraction multiplyFraction(Fraction fractionA, Fraction fractionB)
    {
                Fraction multiplyAns = new Fraction(fractionA.getNumerator()*fractionB.getNumerator(),
                        fractionA.getDenominator()*fractionB.getDenominator());
                return multiplyAns;
    }

    public static Fraction divideFraction(Fraction fractionA, Fraction fractionB)
    {
                Fraction divideAns = new Fraction(fractionA.getNumerator()*fractionB.getDenominator(),
                        fractionA.getDenominator()*fractionB.getNumerator());
                return divideAns;
    }
}
