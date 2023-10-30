class ConvertStrings {
    //metode de converie a sirurilor de caractere in int, double si boolean
    public static int parseInt(String str){
        int integerValue = Integer.parseInt(str);
        return integerValue;
    }
    public static double parseDouble( String str){
        double doubleValue = Double.parseDouble(str);
        return doubleValue;
    }
    public static boolean parseBoolean( String str){
        boolean booleanValue = Boolean.parseBoolean(str);
        return booleanValue;
    }
}
public class String_Conversii {
    public static void main(String[] args) {

        System.out.println("String -> Int");
        System.out.println(ConvertStrings.parseInt("10" ) + ConvertStrings.parseInt("5" ));
        System.out.println(ConvertStrings.parseInt("132"));
        System.out.println();

        System.out.println("String -> Double");
        System.out.println(ConvertStrings.parseDouble("102.5") + ConvertStrings.parseDouble("2.5"));
        System.out.println(ConvertStrings.parseDouble("5"));
        System.out.println(ConvertStrings.parseDouble("145.235"));
        System.out.println();

        System.out.println("String -> Boolean");
        System.out.println(ConvertStrings.parseBoolean("true") && ConvertStrings.parseBoolean("false") );
        System.out.println(ConvertStrings.parseBoolean("true") ||  ConvertStrings.parseBoolean("false"));
        System.out.println();

    }
}
