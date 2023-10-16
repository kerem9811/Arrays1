package arrays;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave8 {
    private static final DecimalFormat df = new DecimalFormat("0.##");
    public static void main(String[] args) {
        int inRange = 0;
        int elever = 0;
        int[] poengsummer;
        int minPoengsum = 0;
        int maxPoengsum = 100;
        int sum = 0;
        double gjennomsnitt;

        try {
            elever = Integer.parseInt(showInputDialog("Skriv først inn hvor mange elever du skal registere."));
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Feil input, skriv inn et heltall.");
        }

        poengsummer = new int[elever];

        for (int i = 0; i < poengsummer.length; i++) {
                try {
                    poengsummer[i] = Integer.parseInt(showInputDialog("Tast inn poengsummer"));
                    if ((poengsummer[i] < minPoengsum) && (poengsummer[i] < maxPoengsum)){
                        showMessageDialog(null, "Poengsum må være mellom 0 og 100.");
                        inRange = 0;
                        break;
                    }
                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Feil input. Skriv inn tall mellom 0 og 100.");
                    break;
                }
                catch (InputMismatchException e) {
                    showMessageDialog(null, "Feil input");
                    break;
                }

                sum = sum + poengsummer[i];
            }
        gjennomsnitt = (double) sum / poengsummer.length;

        for (int j : poengsummer) {
            if (j >= 0 && j <= 100) {
                inRange = 1;
            } else {
                inRange = 0;
                break;
            }
        }

        if (inRange == 1){
            showMessageDialog(null, "Antall elever er " + elever + " \n"
                    + "Summen av poengsummer er " + sum + " \n"
                    + "Gjennomsnittet av alle elevers poengsum er " + df.format(gjennomsnitt));
        } else {
            showMessageDialog(null, "Poengsummer er utenfor omraade.");
        }
    }
}