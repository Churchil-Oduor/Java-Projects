package Data_Structures;
import java.util.Scanner;
class Program{

    public static void main(String ars[]){
        Scanner ask = new Scanner(System.in);
        String input;
        System.out.print("Enter a String: ");
        input = ask.nextLine();
        DelimiterMatching delim = new DelimiterMatching(input);
        System.out.println("Arrangement is "+ delim.isCorrect());



       

    }
}