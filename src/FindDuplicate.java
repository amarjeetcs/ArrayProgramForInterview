public class FindDuplicate {
public static void main(String[] args) {
	int[] arr= {1,1,22,23,43,43,34,32};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("duplicate element is:"+arr[j]);
			}
		}
	}
}
}
