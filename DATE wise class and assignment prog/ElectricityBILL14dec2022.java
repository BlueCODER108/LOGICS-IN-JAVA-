import java.util.Scanner;

class ElectricityBILL14dec2022
{
	public static void main(String[] args) 
	{
		Double foodExp, travelExp, savings;
		Scanner s = new Scanner(System.in);
		System.out.println("\n\n\t\t\t D/d - Domestic");
		System.out.println("\t\t\t C/C - Commercial");
		System.out.println("Enter the type (D/d/C/c): ");
		
        char type = s.next().charAt(0);

		if (type!='D' && type!='d' && type!='C' && type!='c');
		{
			System.out.println("INVALID TYPE");
			return;
		}
		System.out.println("Enter the Units: ");
		int unit = s.nextInt();

		System.out.println("Enter the phase: ");
		int phase = s.nextInt();

		if(ph!=1 && ph!=3){
			System.out.println("INVALID TYPE");
			return
		}


			if (type = 'D' || type = 'd')
			{
				if (unit <=50)
				      amt = unit * 1.45;
				else if (unit <=100)
					amt = (50 * 1.45)+((unit-50)*2.85);
				else if (unit <=200)
					amt = (50*1.45)+(50*2.85)+((unit-100)*3.95);
				else 
					amt=(50*1.45)+(50*2.85)+((100)*3.95)+((unit-200)*4.50);

				sc = 10.00;
				pt = 0.06 * unit ;

				if (phase == 1)
				{
					if(pt < 20)
						pt = 20;
					else
					{
						if(pt<50)
							pt=50;
					}
				}
				
			}



			//Commercial

		else
		{
				if (unit<=100)
				amt = unit * 3.95;

			    else 
			    amt = (100 * 3.95) + ((unit -100) * 7.00);

				sc = 20.00;
				pt = 0.06 * unit;

				if (phase==1)
				{
					if(pt <50)
						pt = 50;
					else{
						if (pt <100)
						pt=100;
					}
				}



				// Common Statements

				tamt = amt + sc + pt;

				System.out.println("D/d - DOmestic /C/c - Commercial :  "+ type );
				System.out.println("No.of Units: " + unit);
				System.out.println("Phase (1/3):  "+ phase);
				System.out.println("Service Charges" + sc);
				System.out.println("Power Tax" + pt);
				System.out.println("Amount" + amt);
				System.out.println("Total amount to be payable"+ tamt);

	}
}