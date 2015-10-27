package operationMethods;

import basicMethods.Operation;

/*
 * Operation interface implementation
 */

public class Addition implements Operation {

	public double compute(double valueOne, double valueTwo) {
		return (valueOne + valueTwo);
	}
}
