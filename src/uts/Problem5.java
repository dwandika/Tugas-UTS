package uts;

public class Problem5 {

    public static int howOld(final String herOld) {
        int age = Character.getNumericValue(herOld.charAt(0));
        return age;
    }
    public static void main(String[] args) {
        System.out.println(howOld("5 Years Old"));
    }
}
