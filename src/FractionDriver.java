public class FractionDriver {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction(10, 20);

        System.out.println(fraction1.toString());
        System.out.println(fraction2.toString());
        fraction1.setNumerator(15);
        fraction1.setDenominator(25);

        System.out.println("Value of " +fraction1.toString()+" + "+fraction2.toString()+" is "+Fraction.addFraction(fraction1, fraction2));
        System.out.println("Value of " +fraction1.toString()+" - "+fraction2.toString()+" is "+Fraction.subtractFraction(fraction1, fraction2));
        System.out.println("Value of " +fraction1.toString()+" * "+fraction2.toString()+" is "+Fraction.multiplyFraction(fraction1, fraction2));
        System.out.println("Value of " +fraction1.toString()+" / "+fraction2.toString()+" is "+Fraction.divideFraction(fraction1, fraction2));

    }
}
