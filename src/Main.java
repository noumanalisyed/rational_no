public class Main {
    public static void main(String[] args) {

        RationalNumber rationalNumber1 = new RationalNumber(4,12);
        RationalNumber rationalNumber2 = new RationalNumber(6,15);
        RationalNumber rationalNumber3 = rationalNumber1.add(rationalNumber2);
        RationalNumber rationalNumber4 = rationalNumber1.sub(rationalNumber2);
        System.out.println(rationalNumber1);
        System.out.println(rationalNumber2);
        System.out.println(rationalNumber3);
        System.out.println(rationalNumber4);
    }
}