package basicMethods;

/* 
 * Class OperationDefinition:
 * - contains getOperation method, which received Operation type parameter, 
 * - returns operation according to parameter.
 */

import operationMethods.Addition;
import operationMethods.Division;
import operationMethods.Product;
import operationMethods.Subtraction;

class OperationDefinition {

	int operationCode;
	private Operation operation;

	public Operation getOperation(int op) {
		this.operationCode = op;
		switch (operationCode) {
		case 0: {
			operation = new Addition();
			break;
		}
		case 1: {
			operation = new Subtraction();
			break;
		}
		case 2: {
			operation = new Product();
			break;
		}
		case 3: {
			operation = new Division();
			break;
		}
		default: {
			operation = null;
		}
		}
		return operation;
	}
}
