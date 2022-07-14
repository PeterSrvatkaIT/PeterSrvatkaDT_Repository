package work13_07_2022;

public class Palindrom1 {
    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        String veta= scan.nextLine();                      //naskenuj vetu v terminal
        String veta = "Jelenovi pivo nelej";                // nastav vetu v kode
        System.out.println("1. " + veta);                   //vytlac povodnu vetu

        String veta2 = reverseVeta(veta);
        System.out.println("2. " + veta2);

        String veta3 = removeWhiteSpaces(veta);
        String veta4 = removeWhiteSpaces(veta2);

        System.out.println("3. " + veta3);
        System.out.println("4. " + veta4);
        System.out.println("Je nasledujuca veta palindrom? " + veta + "\n" + veta3.equalsIgnoreCase(veta4));

    }

    private static String removeWhiteSpaces(String veta) {
        veta = veta.replaceAll("\\s+", "");
        return veta;
    }


    private static String reverseVeta(String veta) {
        //    int dlzka = veta.length();
        StringBuilder opak = new StringBuilder(veta.length());
        for (int i = (veta.length() - 1); i >= 0; i--) {
            opak.append(veta.charAt(i));
        }
        return opak.toString();
    }
}

