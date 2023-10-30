import java.util.Arrays;
import java.util.Scanner;

public class String_AfisareNumarDeLitereIdentice {
    /* programul primește ca parametri datele citite de la tastatura și returnează un array
     ce conține toate cuvintele care au cel puțin o literă identică cu key
     */
    public static void main(String[] args) {
        //citirea de la tastatura a propozitiei
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti numarul de cuvinte:");
        int n = sc.nextInt();

        String [] array  = new String[n];
        for( int i = 0; i < n; i++){
            System.out.println("Introduceti cuvantul " + (i+1) + " :");
            array[i] = sc.next();

        }

        System.out.println("Introduceti un cuvant ce contine numai litere: ");
        String key = sc.next();

        String [] result = letterMatchIgnoreCase(array, key);
        printIntArray(result);
    }

    public static String [] letterMatchIgnoreCase(String [] array, String key){

        int n = key.length();
        int k = array.length;
        int index = 0;
        for( int i = 0; i < k; i++){
            for( int j = 0; j < n-1; j++){
                String str1 = array[i].charAt(j) + "";
                String str2 = key.charAt(j) + "";
                if(str1.equalsIgnoreCase(str2)){
                    index++;
                }
            }
        }
        String [] result = new String[index];

        index = 0;
        for( int i = 0; i < k; i++){
            for( int j = 0; j < n-1; j++){
                String str1 = array[i].charAt(j) + "";
                String str2 = key.charAt(j) + "";
                if(str1.equalsIgnoreCase(str2)){
                    result[index] = array[i];
                    index++;
                }
            }
        }
        result = removeDuplicateWords(result, index);
        return result;
    }
    public static String [] removeDuplicateWords(String array[], int n){
        int index = 0;
        for(int i = 0; i < n; i++){
            int j;
            for( j = 0; j < i; j++ ){
                if (array[i] == array[j]){
                    break;
                }
            }
            if (j==i){
                array[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(array,index);
    }

    private static void printIntArray(String [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
