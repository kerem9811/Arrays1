package arrays;

public class ArrayForelesning {
    public static void main(String[] args) {
        //lager en liste eller array av heltall med 6 objekter
        int [] liste1 = {1,2,3,4,5,6};

        //lager et nytt tomt array med lengde / storrelse 6
        int [] liste2 = new int[6];

        //fyller liste 2 med verdier paa pos 0 til 5
        liste2[0] = 49;
        liste2[1] = 23;
        liste2[2] = 41;
        liste2[3] = 21;
        liste2[4] = 11;
        liste2[5] = 0;

        //Skriver ut det som er i posisjon 3 i println
        //System.out.println(liste2[3]);

        //int i = 0;

        /*for (int i=0; i < liste2.length; i++);{
            //int i = 0;
            System.out.println(liste2[i] + " "); */

        //skriver ut det som er i array navnetabell i println
        String[] navnetabell = {"Knut", "Bob", "Fido"};
        for (String verdi : navnetabell){
            System.out.println(verdi + " ");
        }

        }

    }