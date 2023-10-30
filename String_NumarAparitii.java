import java.util.Arrays;
import java.util.Scanner;

public class String_NumarAparitii {
    //metoda va numara de cate ori apare o litera in propozitie
    public static int countCharacters( String str, char letter){
        int counter = 0;
        int index = str.indexOf(letter);
        while(index >= 0){
            counter++;
            index = str.indexOf(letter, index +1);
        }
        return counter;
    }

    //metoda care formeaza un string cu toate caracterele unice din propozitie
    public static String removeDuplicateLetters(char keyArray[], int n){
        int index = 0;
        for( int i = 0; i < n; i++){
            int j;
            for( j = 0; j < i; j++ ){
                if (keyArray[i] == keyArray[j]){
                    break;
                }
            }
            if (j==i){
                keyArray[index++] = keyArray[i];
            }
        }
        return String.valueOf(Arrays.copyOf(keyArray,index));
    }

    public static void main(String[] args) {
        //citirea de la tastatura a propozitiei
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti o propozitie:");
        String _sentence = sc.nextLine();

        //conversia caracterelor din alcatuirea propozitie la litere mici
        String sentence = _sentence.toLowerCase();

        int n = sentence.length();
        char [] sentenceArray = sentence.toCharArray();

        //formarea cuvantului cheie
        String keyArray = removeDuplicateLetters(sentenceArray, n);

        int k = keyArray.length();

        for( int i = 0; i < k; i++){

            int apparitions = countCharacters(sentence, keyArray.charAt(i));

            System.out.println("Character: " + "\'" + keyArray.charAt(i) +
                    "\'  appears: " + apparitions + "time(s)");
        }
    }
}
