package arrays;

import static arrays.Oppgave4.talliste1;
import static arrays.Oppgave4.talliste2;
//import static arrays.Oppgave4.talliste3;
import static arrays.Oppgave4.talliste4;

public class Oppgave6 {
    public static void main(String[] args) {
        boolean lik1og2 = true;
        if (talliste1.length != talliste2.length) {
            lik1og2 = false;
        } else {
            for (int i = 0; i < talliste1.length; i++) {
                if (talliste1[i] != talliste2[i]) {
                    lik1og2 = false;
                    break;
                }
            }
        }
        if (lik1og2) {
            System.out.println("Array 1 og 2 er like");
        } else {
            {
                System.out.println("Array 1 og 2 er ikke like");
            }
        }
        boolean lik1og4 = true;
        if (talliste1.length != talliste4.length) {
            lik1og4 = false;
        } else {
            for (int i = 0; i < talliste1.length; i++) {
                if (talliste1[i] != talliste4[i]) {
                    lik1og4 = false;
                    break;
                }
            }
        }
        if (lik1og4) {
            System.out.println("Array 1 og 4 er like");
        } else {
            {
                System.out.println("Array 1 og 4 er ikke like");
            }
        }
    }
}