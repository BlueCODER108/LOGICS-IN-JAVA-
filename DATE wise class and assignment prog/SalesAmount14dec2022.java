import java.util.Scanner;

class SalesAmount14dec2022 
{
	public static void main(String[] args) 
	{
		Double ratec,totalrc;
		Scanner s = new Scanner(System.in);		
		System.out.println("Please, Enter the SalesAmount");
		Double salesAmount = s.nextDouble();

		
		if (salesAmount==0)
		{
            System.out.println("INVALID INPUT, RE-ENTER THE SALESAMOUNT");
			return;
		}

		System.out.println("\n\n\t\t\t C/c -Cpu");
		System.out.println("\t\t\t M/m - Monitor");
		System.out.println("Enter the type (C/c/M/m): ");
		
        char item = s.next().charAt(0);

		if (item!='C' && item!='c' && item!='M' && item!='m')
		{
			System.out.println("INVALID Item");
		
		  if (item == 'C' || item == 'c')
		{
			if(salesAmount <10000){
			    ratec = 0.0;
                System.out.println("Rate of Commission is NILL");


				 if (salesAmount >=10000 && salesAmount <= 25000){
                       ratec =  ratec + (salesAmount *  8 /100);  // can also write ratec+= 
			           System.out.println("Rate of Commission is: " + ratec);


			             if (salesAmount >=25000 ){
			                 ratec = ratec + (2000 + (salesAmount * 10/100));    
		                     System.out.println("Rate of Commission is: " + ratec + "added by Rs 2000 + 10 % on salesAmount in excess of 25,000");

							           
									    if (item == 'M' || item == 'm')
                                                        {
		                                                       if (salesAmount <10000){
 
		                                                            ratec = salesAmount* 5/100;
		                                                                System.out.println("Rate of Commission is 5 % :  " + ratec);

		   
		                                                                           if(salesAmount >= 10000)
		                                                                                     {
                                                                                                ratec = (salesAmount* 5/100) + ((salesAmount -1000)*8/100);
			                                                                                     System.out.println("Rate of Commission is:  " + ratec);
		                                                                                       }
	                                                              }
                                                      }
		                                      }
		         }
	       }
		}
       
		}
	}

		   
}




	 