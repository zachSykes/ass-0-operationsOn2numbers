/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author ilker
 *
 */
public abstract class OperatorFor2numbers implements Has2numbers {
	protected Float number1;
	protected Float number2;
	
	public OperatorFor2numbers(float number1, float number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public Float getNumber1() {
		return number1;
	}
	public Float getNumber2() {
		return number2;
	}
}
