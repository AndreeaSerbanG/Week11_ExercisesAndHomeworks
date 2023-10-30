import java.util.Scanner;

public class String_InlocuireAparitii {
    //programul va inlocui DOAR prima si ultima aparitie a cuvantului care se doreste a fi schimbat

    public static void main(String[] args) {
        //citirea de la tastatura a propozitiei
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti o propozitie:");
        String sentence = sc.nextLine();

        System.out.println("Introduceti cuvantul pe care doriti sa il inlocuiti:");
        String oldWord = sc.next();
        String _oldWord = oldWord + " ";

        System.out.println("Introduceti cuvantul cu care doriti sa fie inlocuit:");
        String newWord = sc.next();
        String _newWord = newWord + " ";

        int indexFirstAp = sentence.indexOf(_oldWord);
        int indexLastAp = sentence.lastIndexOf(_oldWord);


        if (indexFirstAp != indexLastAp) {
            String substring1 = sentence.substring(0, indexFirstAp + 1);

            String substring2 = sentence.substring(indexFirstAp + 1, indexLastAp);
            substring2 = substring2.replace(_oldWord, _newWord);

            String substring3 = sentence.substring(indexLastAp);

            String result = substring1 + substring2 + substring3;
            System.out.println("INPUT: \"" + sentence +
                    "\"\nOld word: " + oldWord + "\nNew word: " + newWord + "\nOUTPUT: \"" + result + "\"");
        } else {
            System.out.println("INPUT: \"" + sentence +
                    "\"\nOld word: " + oldWord + "\nNew word: " + newWord + "\nOUTPUT: \"" + sentence + "\"");
        }
    }
}
