class Simple
{  
    public static void main(String args[])
	{  
      int a[]={33,3,4,5,22,9,10};
	  int i,j;
	  for(i=0;i<a.length;i++)
	  {
		 if(i!=0 && i!=a.length-1)
		 {
			if(a[i]>=a[i-1] && a[i]>=a[i+1])
			{
			System.out.println(a[i]);
			}
		 }
		 else
		 {
		 if(i==0&&a[i]>a[i+1])
		 {
			 System.out.println(a[i]);
		 }
		 if(i==a.length-1&&a[i]>a[i-1])
		 {
			 System.out.println(a[i]);
		 }
		}
	  }
    }  
} 

