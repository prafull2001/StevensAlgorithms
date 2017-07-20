import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
class anagramsFinal
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.nextLine(); 
		str1 = str1.toLowerCase();
		char[] charArray1 = str1.toCharArray();
		System.out.println("charArray1 = " + Arrays.toString(charArray1));
		
		String str2 = scan.nextLine(); 
		str2 = str2.toLowerCase();
		char[] charArray2 = str2.toCharArray();
		System.out.println(Arrays.toString(charArray2));
		
		if (charArray1.length != charArray2.length)
			System.out.println("charArray2 = " + "Two strings are not anagrams.");
		else
		{	
			int arrayProduct1 = 1;
			int n = 0;
			while(n<charArray1.length)
			{
				arrayProduct1 = arrayProduct1 * getCharPrime(charArray1, n);
				n = n+1;
			}
			
			int arrayProduct2 = 1;
			int m = 0;
			while(m<charArray2.length)
			{
				arrayProduct2 = arrayProduct2 * getCharPrime(charArray2, m);
				m = m+1;
			}
			
			if(arrayProduct1 == arrayProduct2)
				System.out.println("Two strings are anagrams.");
			else
				System.out.println("Two strings are not anagrams.");
		}		
			
	}
	public static int getCharPrime(char[] charArrayx, int x)
	{
		if (charArrayx[x] == 'a')
			return 2;
		else if (charArrayx[x] == 'b')
			return 3;
		else if (charArrayx[x] == 'c')
			return 5;
		else if (charArrayx[x] == 'd')
			return 7;
		else if (charArrayx[x] == 'e')
			return 11;
		else if (charArrayx[x] == 'f')
			return 13;
		else if (charArrayx[x] == 'g')
			return 17;
		else if (charArrayx[x] == 'h')
			return 19;
		else if (charArrayx[x] == 'i')
			return 23;
		else if (charArrayx[x] == 'j')
			return 29;
		else if (charArrayx[x] == 'k')
			return 31;
		else if (charArrayx[x] == 'l')
			return 37;
		else if (charArrayx[x] == 'm')
			return 41;
		else if (charArrayx[x] == 'n')
			return 43;
		else if (charArrayx[x] == 'o')
			return 47;
		else if (charArrayx[x] == 'p')
			return 53;
		else if (charArrayx[x] == 'q')
			return 59;
		else if (charArrayx[x] == 'r')
			return 61;
		else if (charArrayx[x] == 's')
			return 67;
		else if (charArrayx[x] == 't')
			return 71;
		else if (charArrayx[x] == 'u')
			return 73;
		else if (charArrayx[x] == 'v')
			return 79;
		else if (charArrayx[x] == 'w')
			return 83;
		else if (charArrayx[x] == 'x')
			return 89;
		else if (charArrayx[x] == 'y')
			return 97;
		else if (charArrayx[x] == 'z')
			return 101;
		else return 1;
	}
}