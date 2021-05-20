package counting_sheep;

import java.util.Arrays;

public class Counter {
	public static int countSheeps(Boolean[] arrayOfSheeps) {
		if(arrayOfSheeps.length == 0) {
			return 0;
		}
		if(arrayOfSheeps[0])
		{
			return 1 + countSheeps(Arrays.copyOfRange(arrayOfSheeps, 1, arrayOfSheeps.length));
		}
		
		return countSheeps(Arrays.copyOfRange(arrayOfSheeps, 1, arrayOfSheeps.length));
	  }
	
	public static void main(String args[])
	{
		int count = countSheeps(new Boolean[] {true, false, false, true});
		System.out.println(count);
	}
}
