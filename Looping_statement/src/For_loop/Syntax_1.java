package For_loop;

public class Syntax_1 {
    // This is standard syntax for for loop
	public static void main(String[] args) {
//		int i;                     // 1.check the initialization
//		for(i=1;i<=10;i++)         // 2.enter in block print 
//		{                          // 3.do increment and 4. check condition
//			System.out.println(i); // 5.print the incremented value 
//		}                          // 6.till do step 3-5 until condition satisfy
		
		// it will go on infinite integer loop bcz we didnt given the condition
//		int i=1;
//		for (;;i++)
//			System.out.println(i);
		
		//it will go on infinite 1 loop bcz we incrimented after the sysout
//		int i=1;
//		for(;i<=10;)
//			System.out.println(i);
//			i++;
		
		//This is also correct to initialize while assigning variable
//			int i=1;
//			for(;i<=10;i++)
//				System.out.println(i);
//		53.. What will happen on running the following code ?
				  
				try
				  
				{
				  
				  int arr[]={1,2};
				  
				  arr[2]=3/0;
				  
				  System.out.println(arr[0]);         
				  
				}
				  
				catch(Exception e)
				  
				{
				  
				  System.out.println("Exception");
				  
				}
				  
//				catch(ArithmeticException e)
//				  
//				{
//				  
//				  System.out.println("Divide by Zero");
//				  
//				}
//				
			
	}

}
