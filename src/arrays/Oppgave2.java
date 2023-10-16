package arrays;

import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave2 {

    public static void main(String[] args) {
        int sum = 0;
        double sum2 = 0;
        int antallMerEnn5 = 0;
        int sum3 = 0;

        for (int i = 0; i < Oppgave1.liste1.length; i++) {
            sum = sum + Oppgave1.liste1[i];
            if (Oppgave1.liste1[i] > 5) {
                sum2 = sum2 + Oppgave1.liste1[i];
                antallMerEnn5++;
            }
        }

        int gjennomsnitt1 = sum / Oppgave1.liste1.length;
        double gjennomsnitt2 = sum2 / antallMerEnn5;

        for (int tall : Oppgave1.liste1)
            sum3 += tall;

        showMessageDialog(null, "Summen av alle elementene i listen er " + sum + "  \n"
                    + "Gjennomsnittet av alle elementer er " + gjennomsnitt1 + "  \n"
                    + "Summen av alle tall større enn " + gjennomsnitt1 + " er " + sum2 + "  \n"
                    + "Gjennomsnittet av alle tall større enn gjennomsnittet er " + gjennomsnitt2 + "  \n"
                    + "Summen av tallene med forenklet for-loop er " + sum3);
        }
    }