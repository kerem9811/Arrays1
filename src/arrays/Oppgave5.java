package arrays;

import static arrays.Oppgave4.talliste1;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {
    public static void main(String[] args) {

        int max = talliste1[0];
        for (int i = 0; i < talliste1.length; i++){
            if (max < talliste1[i]){
                max = talliste1[i];
            }
        }
        System.out.println(max);

        int min = talliste1[0];
        for (int j = 0; j < talliste1.length; j++) {
            if (min > talliste1[j]){
                min = talliste1[j];
            }
        }
        System.out.println(min);

        showMessageDialog(null, "Den minste verdien i arrayet er " + min + " \n"
        + "Den storste verdien i arrayet er " + max);
    }
}
