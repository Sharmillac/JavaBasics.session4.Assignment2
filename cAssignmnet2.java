package assignment4;
import java.util.Arrays;
public class cAssignmnet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mPrintReverseArray();
		
	}

	private static void mPrintReverseArray() 
	{
		
		
		int[] lArray = {2, 1, 9, 6, 4};
		
		int[] lArrayNew  = new int[(lArray.length + 1)];
		Arrays.sort(lArray);
		System.out.println("Initial Array Sorted");

		for(int i = 0; i <lArray.length ; i++)
		{
			System.out.println(lArray[i]);
		}
		
		
		
		System.out.println("Insert 12 as element 3");
		int lPosition = 3;
		
		
		for(int i = 0; i < lPosition - 1; i++)
		{
			lArrayNew[i] = lArray[i]; 
			System.out.println(lArrayNew[i]);
		}
		lArrayNew[lPosition - 1] = 12;
		
		for(int i = 0; i <lArrayNew.length ; i++)
		{
			System.out.println(">>>>>>>>>>>>>>>>>"+lArrayNew[i]);
		}
		
		
		
		for(int i = lPosition ; i <= lArray.length ; i++)
		{
			lArrayNew[i] = lArray[i-1]; 
			System.out.println(".."+lArrayNew[i]);
		}
		
		
		for(int i = 0; i <lArrayNew.length ; i++)
		{
			System.out.println(">>>"+lArrayNew[i]);
		}
		
	}

}

