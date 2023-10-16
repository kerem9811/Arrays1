package arrays;

public class Oppgave4 {
    static int[] talliste1 = {45, 34, 5, 8, 10, 2, 13, 25};
    static int[] talliste2 = {45, 34, 5, 8, 10, 2, 13, 25};
    static int[] talliste3 = {25, 13, 2, 10, 8, 5, 34, 45};
    static int[] talliste4 = {12, 21, 25, 15, 9, 6, 35, 49, 9, 0};

    static int[] talliste5 = {0};

    public static void main(String[] args) {
        for (int i = 0; i < talliste1.length; i++) {
            System.out.print(talliste1[i] + " ");
        }
        System.out.println();

        for (int i = talliste1.length - 1; i >= 0; i--) {
            System.out.print(talliste1[i] + " ");
        }
    }
}
