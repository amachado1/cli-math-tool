/*
 * 	Source: JCalc.java
 * 	Author: Anthony Machado
 * 
 * 	Purpose: This program performs basic mathematical operations with 2 numbers.
 * 
 * 	Feb 9, 2025
 * 
 * 	Program exit codes:
 *	*	0: Executes successfully without error
 *	*	1: Too many arguments provided
 *	*	2: Not enough arguments were provided
 *	*	3: User provided an invalid operation
 *	*	4: User tried to divide by zero
 *	*	5: User provided invalid operands
 */


public class JCalc 
{

	public static void main(String[] args) 
	{
		//	Shows program identification of the program and its author
		id();
		
		if (args.length < 3) 
		//	Executes if not enough arguments are supplied
		{
            System.err.println("*** ERROR: Too few arguments.");
            usage();
            System.exit(2);
        }
		
		else if (args.length > 3) 
		//	Executes if too many arguments are supplied
		{
			System.err.println("*** ERROR: Too many arguments.");
			usage();
			System.exit(1);
		}
		
		
		else 
		//	Executes normally if sufficient amount of arguments are supplied
		{
			try 
			{
				//	Try block performs operations like normal
				//	Arguments in position 1 and 2 are put into num1 and num2 converted into a double
				double num1 = Double.parseDouble(args[1]);
				double num2 = Double.parseDouble(args[2]);
				double result = 0;
				
				//	Switch statement determines what operation to do based on the first argument
				switch(args[0]) 
				{
					//	Does an addition operation if user inputs "add" as first argument
					case "add":
						result = num1 + num2;
						break;
					
					//	Does a subtraction operation if user inputs "sub" as first argument
					case "sub":
						result = num1 - num2;
						break;
					
					//	Does a multiplication operation if user inputs "mul" as first argument
					case "mul":
						result = num1 * num2;
						break;
					
					//	Does a division operation if user inputs "div" as first argument
					case "div":
						//	If user tries to divide by 0, output error code and exit with exit value 4
						if (num2 == 0) 
						{
							System.err.println("***	ERROR: Cannot divide by zero.");
							System.exit(4);
						}
						
						//	Else does normal operation
						else 
						{
							result = num1 / num2;
						}
						break;
					
					//	Default case if user inputs an invalid operation
					default:
						System.err.println("*** ERROR: Invalid operation");
						System.err.println("\nValid operations: add|sub|mul|div");
						System.exit(3);
						break;
				}
				
				//	When successful, program prints out result as output
				System.out.println(result);
				
			} 
			
			catch (NumberFormatException e) 
			//	Catches NumberFormatException if user inputs invalid operands
			{
				System.err.println("*** ERROR: Invalid Operands");
				System.err.println("\nUsage: JCalc add|sub|mul|div num1 num2");
				System.exit(5);
			}
		}
	}
	
	
	private static void usage() 
	//	Method to explain how to use the program
	{
		System.err.println("\nProgram requires 3 command line arguments.");
		System.err.println("Usage: JCalc add|sub|mul|div num1 num2");
	}
	
	
	private static void id() 
	//	Shows name of program and name of author
	{
		System.out.println("JCalc, Anthony Machado: Fastest programmer in the west *Western music plays here*");
	}

}
