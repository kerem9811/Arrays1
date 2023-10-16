package arrays;

import static arrays.Oppgave4.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave7 {
    public static void main(String[] args) {
        int oddeteller = 0;
        int parteller = 0;
        for (int i = 0; i < talliste4.length; i++) {
            if (talliste4[i] % 2 == 0) {
                parteller++;
            } else {
                oddeteller++;
            }
        }
        System.out.println("I arrayet er det: \n"
                + parteller + " partall og \n"
                + oddeteller + " oddetall.");
        showMessageDialog(null, "I arrayet er det: \n"
                + parteller + " partall og \n"
                + oddeteller + " oddetall.");
    }
}
