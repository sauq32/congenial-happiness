package nz.ac.eit.amazingtranslator69;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the number you want to translate?" );
        Scanner scan=new Scanner(System.in);
        String numberToTranslateInString = scan.nextLine();
        int numberToTranslate = Integer.parseInt(numberToTranslateInString);

        System.out.println(numberToTranslate);
    }
}
