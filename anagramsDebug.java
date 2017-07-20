import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
class anagramsDebug
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the DEBUG VERSION of anagramsfinal.java");
		System.out.println("All variables are printed to make error detection easier.");
		System.out.println("This version of the program will run more slowly than the final product.");
		
		String str1 = scan.nextLine(); 
		str1 = str1.toLowerCase();
		char[] charArray1 = str1.toCharArray();
		System.out.println("str1 = " + str1);
		System.out.println("str1.length = " + str1.length());
		System.out.println("charArray1.length = " + charArray1.length);
		System.out.println("charArray1 = " + Arrays.toString(charArray1));
		
		String str2 = scan.nextLine(); 
		str2 = str2.toLowerCase();
		char[] charArray2 = str2.toCharArray();
		System.out.println("str2 = " + str2);
		System.out.println("str2.length = " + str2.length());
		System.out.println("charArray2.length = " + charArray2.length);
		System.out.println("charArray2 = " + Arrays.toString(charArray2));
		
		if (charArray1.length != charArray2.length)
			System.out.println("Two strings are not anagrams. Cause: charArray.length do not match");
		else
		{	
			int arrayProduct1 = 1;
			int n = 0;
			while(n<charArray1.length)
			{
				arrayProduct1 = arrayProduct1 * getCharPrime(charArray1, n);
				System.out.println("Convert " + charArray1[n] + " from charArray1 to " + getCharPrime(charArray1, n));
				n = n+1;
			}
			System.out.println("n = " + n);
			System.out.println("arrayProduct1 = " + arrayProduct1);
			
			int arrayProduct2 = 1;
			int m = 0;
			while(m<charArray2.length)
			{
				arrayProduct2 = arrayProduct2 * getCharPrime(charArray2, m);
				System.out.println("Convert " + charArray2[m] + " from charArray2 to " + getCharPrime(charArray2, m));
				m = m+1;
			}
			System.out.println("m = " + m);
			System.out.println("arrayProduct2 = " + arrayProduct2);
			
			if(arrayProduct1 == arrayProduct2)
				System.out.println("Two strings are anagrams.");
			else
				System.out.println("Two strings are not anagrams. Cause: arrayProduct do not match");
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