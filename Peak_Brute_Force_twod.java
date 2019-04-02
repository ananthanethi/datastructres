class Peak_Brute_Force_twod
{  
    public static void main(String args[])
	{ 
		int a[][]={{33,3,4},{5,22,9},{10,17,19}};
		 for(int i=0;i<a.length;i++)
		{
		  for(int j=0;j<a.length;j++)
		  {
		  if(i!=0 && i!=a.length-1&&j!=0&&j!=a.length-1)
		  {
			if(a[i][j]>=a[i-1][j]&& a[i][j]>=a[i][j-1] && a[i][j]>=a[i+1][j] && a[i][j]>=a[i][j+1])
			{
				System.out.println(a[i][j]);
			}
		  
		  }
		  
		  }
		  
		  }
		  }
}
	  