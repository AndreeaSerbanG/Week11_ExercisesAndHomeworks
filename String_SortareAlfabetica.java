import java.util.Scanner;

public class String_SortareAlfabetica {
    /*
    Programul primește ca parametru mulțimea de cuvinte și returnează al doilea si penultimul cuvânt
    în ordine lexicografică.
     */
    public static void main( String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de cuvinte:");
        int arrayLength = sc.nextInt();

        String [] array = new String [arrayLength];
        int wordsCnt=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduceti cuvantul " + (i+1) + ":");
            array[i] = sc.next();
        }
        sc.close();
        bubbleSortAsc(array);

        System.out.println("Al doilea cuvant este: " + secondWordInArray(array));
        System.out.println("Penultimul cuvant este: " + lastButOneInArray(array));
    }
    public static String [] bubbleSortAsc( String [] array){
        int n = array.length;

        while( n > 1 ){
            int newN = 0;

            for ( int i = 1; i < n ; i++){
                if( array[i-1].compareTo(array[i]) > 0) {
                    String tmp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = tmp;
                    newN = i;
                }
            }
            n = newN;
        }
        return array;
    }
    public static String secondWordInArray(String[] array){
        return array[1];

    }
    public static String lastButOneInArray(String[] array){
        return array[array.length-2];
    }
}
