package unit05;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   char x = a.charAt(0);
	   char y = a.charAt(a.length()-1);
	   if (x=='a'|| x=='e' || x=='i' || x=='o' || x=='u'|| x=='A' || x=='E' || x=='I' || x=='O'|| x=='U' || y=='a'|| y=='e' || y=='i' || y=='o' || y=='u'|| y=='A' || y=='E' || y=='I' || y=='O'|| y=='U') {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}