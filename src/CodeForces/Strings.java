//package CodeForces;


import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNaVhode = sc.next();
        String strNaVuhode = "";
        for (int i = 0; i < strNaVhode.length(); i++) {
            if (!isGlasna(strNaVhode.charAt(i))) {
                strNaVuhode += "." + strNaVhode.toLowerCase().charAt(i);
            }
        }
        System.out.println(strNaVuhode);
    }

    private static boolean isGlasna(Character bukva) {
        Character bukovka = Character.toLowerCase(bukva);
        return bukovka == 'a' ||
                bukovka == 'o' ||
                bukovka == 'y' ||
                bukovka == 'e' ||
                bukovka == 'i' ||
                bukovka == 'u';
    }
}
