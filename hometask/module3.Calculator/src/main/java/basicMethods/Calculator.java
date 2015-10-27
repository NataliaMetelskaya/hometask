package basicMethods;

import java.util.Scanner;

/* 
 * Class Calculator: 
 * - gets arguments and operation type from user, 
 * - execute operation with object received from OperationDefinition, 
 * - output compute results.
 */

class Calculator {

	OperationDefinition operationDefinition;

	public Calculator(OperationDefinition operation) {
		this.operationDefinition = operation;
	}

	public void compute() {

		boolean nextStep = true; //Exit cycle condition
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); //Input stream declaration

		do {

			//Input first argument from keyboard
			System.out.println("Please input first argument:");
			double arg1 = in.nextDouble();

			//Input operation from keyboard
			System.out.println("Please define operation:");
			System.out.print("0 - Addition(+); \t");
			System.out.print("1 - Subtraction(-); \t");
			System.out.print("2 - Product(*); \t");
			System.out.println("3 - Division(/):");

			int operation = in.nextInt();

			//Input second argument from keyboard
			System.out.println("Please input second argument:");
			double arg2 = in.nextDouble();

			//Output result
			System.out.print("The result is: \t");
			Operation op = operationDefinition.getOperation(operation);
			
			if (op != null){
				System.out.println(op.compute(arg1, arg2) + ". \n");
			}
			else {
				System.out.println("Invalid operation!!!");
			}
			
			//Exit cycle check
			System.out.println("Would you like to continue?");
			System.out.print("1 - Continue; \t");
			System.out.println("2 - Exit.\n");
			
			int goOn = in.nextInt();
			if (goOn == 2){
				nextStep = false;
			}
			
		} while (nextStep);
	}
}
