/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.crkf.lotto;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author crkf
 */
public class LottoGenerator {

    /**
     * The method will provide a valid tip
     * @param Zahl
     */
    public static void pcTipp(int f[]) {
        int i, z;
        Random zufall = new Random();

        for (i = 0; i < 6; i++) {
            do // no duplicates are allowes
            {
                z = zufall.nextInt(45) + 1;   //detect z
            } while (z == f[0] || z == f[1] || z == f[2] || z == f[3] || z == f[4]);

            f[i] = z;     // assign z

        }
    }   //  Ende pcTipp

    /**
     * This method will find matching numbers from the guess and drawing
     * and return the number of congruities
     *
     * @param f
     * @param g
     * @return
     */
    public static int vergleich(int f[], int g[]) {
        int r = 0, i, a;


        for (i = 0; i < 6; i++) {
            for (a = 0; a < 6; a++) {
                if (f[i] == g[a]) {
                    r++;            // number of congruities

                }
            }
        }

        return r;
    }

    public static boolean checkDublicates(int[] array) {

        boolean doppelteVorhanden = false;
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                doppelteVorhanden = true;
            }
        }
        return doppelteVorhanden;
    }

    public static String sort(int z[]) {
        Arrays.sort(z);

        return "" + z[0] + "  " + z[1] + "  " + z[2] + "  " + z[3]
                + "  " + z[4] + "  " + z[5];
    } 
}
