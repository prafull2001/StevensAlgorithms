import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
class anagramsFinal
{
    //Constants used for hashing
    private static final int A = 27382126;
    private static final int B = 97382923;
	
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        str1 = str1.toLowerCase();

        String str2 = scan.nextLine();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length())
            System.out.println("Two strings are not anagrams.");
        else
        {
            long arrayProduct1 = 1;
            for(int i = 0; i < str1.length(); i++){
                arrayProduct1 = (arrayProduct1 * (A + str1.charAt(i))) % B;
            }

            long arrayProduct2 = 1;
            for(int i = 0; i < str2.length(); i++){
                arrayProduct2 = (arrayProduct2 * (A + str2.charAt(i))) % B;
            }
		
            if(arrayProduct1 == arrayProduct2)
                System.out.println("Two strings are anagrams.");
            else
                System.out.println("Two strings are not anagrams.");
        }

    }
}
