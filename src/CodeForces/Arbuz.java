package CodeForces;

import java.util.Scanner;

/**
 * Created by konstruktor on 29.09.2016.
 */
public class Arbuz {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        short w = vvod.nextShort();
        short n = 2;
        if ((w % 2 == 0) & (w > 2)) {
            System.out.println("YES");
        } else if (w == 2) {
            System.out.println("NO");
        } else {
            System.out.println("NO");
        }
    }
}
