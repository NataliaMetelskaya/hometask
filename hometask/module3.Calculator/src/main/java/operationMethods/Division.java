package operationMethods;

import basicMethods.Operation;

/*
 * Operation interface implementation
 */

public class Division implements Operation {

	public double compute(double valueOne, double valueTwo) {
		return (valueOne / valueTwo);
	}
}