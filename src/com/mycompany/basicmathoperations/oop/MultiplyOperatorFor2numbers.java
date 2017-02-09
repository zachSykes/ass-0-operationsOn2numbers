/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author ilker
 *
 */
public class MultiplyOperatorFor2numbers extends OperatorFor2numbers implements Multiply {

	public MultiplyOperatorFor2numbers(float number1, float number2) {
		super(number1,number2);
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Multiply#multiply(int, int)
	 */
	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Multiply#multiply(float, float)
	 */
	@Override
	public float multiply(float num1, float num2) {
		return num1 * num2;
	}

	@Override
	public float multiply2numbers() {
		return number1 * number2;
	}

}
