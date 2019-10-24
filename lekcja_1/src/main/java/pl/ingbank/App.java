package pl.ingbank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // zmienne i typy
        // instrukcje warunkowe
        // pętle
        // funkcje (wejscie wyjscie)
        // public private static
        System.out.println(addTwo(30));
        System.out.println();
    }

    private static int addTwo(int inputNumber) {
        return inputNumber+2;
    }
}
