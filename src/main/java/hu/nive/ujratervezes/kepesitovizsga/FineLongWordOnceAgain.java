package hu.nive.ujratervezes.kepesitovizsga;

public class FineLongWordOnceAgain {

    public char[][] getFineLongWordOnceAgainButNowInAReverseWay(String s, int i) {

        int t = s.length()-i+1;

        char[][] result = new char[t][i];

        for (int f = 0; f<t; f++) {

            for (int g = 0; g<i; g++ ) {
                result[f][g] = Character.toUpperCase(s.toCharArray()[f+g]);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        FineLongWordOnceAgain fineLongWordOnceAgain = new FineLongWordOnceAgain();
        System.out.println(fineLongWordOnceAgain.getFineLongWordOnceAgainButNowInAReverseWay("example", 4));
    }
}
