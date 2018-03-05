/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author zacharysykes
 *
 */
public class AddOperatorFor2numbers extends OperatorFor2numbers implements Add {

	public AddOperatorFor2numbers()
	{
		
	}
	public AddOperatorFor2numbers(float _number1, float number2)
	{
		super(_number1, number2);	//NOTE 1st the parent's constructor executes
		System.out.println("parent's number1 is " +super.number1);
		System.out.println("_number1: " + _number1);
		System.out.println("number2 Sabrina says whatever: " + number2);
	}
	public AddOperatorFor2numbers(float number1, float number2, String junk)
	{
		this(number1, number2);	//NOTE 1st the constructor above runs
		Float someJunk = this.add(number1, number2);
		System.out.println("junk: " +junk);
	}
	
	@Override
	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	
	@Override
	public float add(float num1, float num2)
	{
		return num1+num2;
	}
	
	@Override
	public float add2numbers()
	{
		return number1+number2;
	}
}
