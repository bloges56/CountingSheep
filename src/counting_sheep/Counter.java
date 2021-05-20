package counting_sheep;

public class Counter {
	public static int countSheeps(Boolean[] arrayOfSheeps) {
		int count = 0;
		for(int i = 0; i < arrayOfSheeps.length; i++)
		{
			if(arrayOfSheeps[i])
			{
				count++;
			}
		}
		return count;
	  }
	
	public static void main(String args[])
	{
		int count = countSheeps(new Boolean[] {true, false, false, true});
		System.out.println(count);
	}
}
