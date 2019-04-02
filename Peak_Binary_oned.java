class Peak_Binary_oned
{  
public static void peak_find(int num[],int start_pos,int end_pos)
{

int mid=(start_pos+end_pos)/2;
if(mid>=0 && mid<num.length)
{
if(num[mid]>=num[mid-1]&&num[mid]>=num[mid+1])
{
	System.out.println(num[mid]);
}
else if(num[mid]<num[mid-1])
{
peak_find(num,start_pos,mid);
}
else{
peak_find(num,mid,end_pos);
}

}
else{
System.out.println(0);
}

}
    public static void main(String args[])
	{  
      int a[]={33,3,4,5,22,9,10};
	  peak_find(a,0,a.length);
	
	  
	}
}