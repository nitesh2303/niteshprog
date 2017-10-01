//program for checking duplicate number

class DuplicateNum
{
	public static void main(String []args)
	{
		int arr[]={5,6,4,9,8,7,2,3,1,5,6,7};
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate no="+arr[j]);
					break;
				}
			
			}	
		}

	}
}