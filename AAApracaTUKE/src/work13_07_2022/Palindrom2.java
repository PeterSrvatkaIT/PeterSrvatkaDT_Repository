package work13_07_2022;

public class Palindrom2 {
    public static void main(String[] args) {

        String veta = "Kajak";

        System.out.println("Je nasledujuci vyraz palindrom? " + veta + "\n" + comparePalindrom(veta));
    }

    private static String comparePalindrom(String veta) {
        for (int i = 0; i < veta.length(); i++) {
            if ((Character.toUpperCase(veta.charAt(i))) != (Character.toUpperCase(veta.charAt(veta.length() - i - 1)))) {
                return "Nie, nie je to palindrom";
            }
        }
        return "Ano, toto je palindrom..";
    }
}

