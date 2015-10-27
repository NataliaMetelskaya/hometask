package basicMethods;

/*
 * Main class CalculatorRunner:  
 * - creates instance of operationDefinition class,  
 * - creates instance of Calculator class, give it as a parameter operationDefinition object, 
 * - executes calc method for created object Calculator.
 */

public class CalculatorRunner {
	public static void main(String[] args) {

		OperationDefinition operationDefinition = new OperationDefinition();

		Calculator calc = new Calculator(operationDefinition);

		calc.compute();

	}
}
