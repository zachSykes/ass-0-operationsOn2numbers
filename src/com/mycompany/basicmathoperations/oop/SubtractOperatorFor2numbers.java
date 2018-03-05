/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author zacharysykes
 *
 */
public class SubtractOperatorFor2numbers extends OperatorFor2numbers implements Subtract{
	public SubtractOperatorFor2numbers()
	{
		
	}
	public SubtractOperatorFor2numbers(float _number1, float number2)
	{
		super(_number1, number2);	//NOTE 1st is the parent's constructor executes
		System.out.println("parent's number 1 is " +super.number1);
		System.out.println("_number1: " + _number1);
		System.out.println("number2 Sabrina says whatever: " + number2);
	}
	
	public SubtractOperatorFor2numbers(float number1, float number2, String junk)
	{
		this(number1, number2);	//NOTE 1st constructor above runs
		Float someJunk = this.subtract(number1, number2);
		System.out.println("junk: " +junk);
	}
	
	@Override
	public int subtract(int num1, int num2)
	{
		return num1-num2;
	}
	
	@Override
	public float subtract(float num1, float num2)
	{
		return num1-num2;
	}
	
	@Override
	public float subtract2numbers()
	{
		return number1-number2;
	}
}
