package arrays;

class Person{
    public String navn;
    public int alder;
}
public class Array2 {
    public static void main(String[] args){
        //arrayet inneholder 3 plasser men vi lager bare 2 objekter
        Person[] personliste = new Person[3];
        Person knut = new Person();
        knut.navn = "Knut";
        knut.alder = 35;
        personliste[0] = knut;
        Person johnny = new Person();
        johnny.navn = "Johnny";
        johnny.alder = 34;
        personliste[1] = johnny;

        for (int i = 0; i < personliste.length; i++){
            //hvis en plass er tom, skriver vi ikke ut det som er der, for det gir null-pointer error
            if (personliste[i] != null) {
                System.out.println(personliste[i].navn + " " + personliste[i].alder);
            }
        }
    }
}
