class Factorial 
{
	public static void fact (int n)
	{
     int res=1;
	 while(n>1)
	{
		 res=res*n;
			 n--;
	}
     System.out.println(res);
	}
	public static void main(String[] args) 
	{
		fact(5);
	    fact(4);
	}
}
