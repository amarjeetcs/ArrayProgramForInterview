/*
public class FindOddEvenInArray {
		public static void main(String[] args) {
			int[] arr= {1,2,3,4,5};
			System.out.println("even numbers:");
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
					System.out.println("number is even"+arr[i]);
			}
			System.out.println("odd numbers:");
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2!=0)
					System.out.println("number is odd"+arr[i]);
			}
			
		}
	}
*/

class FindOddEvenInArray
{
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		System.out.println("Even elements");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even elements: "+arr[i]);
			}
		}
		System.out.println("Odd Elements");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("odd elements: "+arr[i]);
			}
		}
	}
}