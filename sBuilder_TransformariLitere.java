import java.util.Scanner;

public class sBuilder_TransformariLitere {
    public static void main( String [] args) {
        //programul va tranforma literele mari in litere mici si invers, facand abstractie de celelate caractere

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti o propozitie:");
        String sentence = sc.nextLine();
        StringBuilder sBuilder = new StringBuilder(sentence);

        int n = sBuilder.length();
        for( int i = 0; i < n; i++){
            if(Character.isUpperCase(sBuilder.charAt(i))){
                sBuilder.setCharAt(i, Character.toLowerCase(sBuilder.charAt(i)));
            }else{
                sBuilder.setCharAt(i, Character.toUpperCase(sBuilder.charAt(i)));
            }
        }
        String result = sBuilder.toString();
        System.out.println(result);
    }
}
