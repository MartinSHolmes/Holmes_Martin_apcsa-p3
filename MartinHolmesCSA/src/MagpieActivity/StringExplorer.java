package MagpieActivity;
/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		int pos = sample.indexOf("slow");
		if(pos != -1) {
			System.out.println("slow is found at position " + pos);
		}
		else {
			System.out.println("slow is not found");
		}
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int x = 0;
		int y = 0;
		String test = "Computer Science is the best, the greatest, and the most wonderful subject to study";
		System.out.print("The indeces where 'the' occurs are ");
		for(int i = 0; i < test.length()-2;i++) {
			x=test.substring(i,test.length()).indexOf("the");
			if (x>-1) {
				if(x+i>y) {
					System.out.print(x+i + ", ");
					y = x+i;
				}
			}
			
		}
		
	}

}
