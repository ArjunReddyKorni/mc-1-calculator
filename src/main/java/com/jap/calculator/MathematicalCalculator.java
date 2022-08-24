package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2)
	{
		int addition = 0;
		try{
			addition = num1+num2;
		}catch (Exception e){
			System.out.println("e = " + e);
		}

		return addition;
	}
	public int subtract(int num1, int num2)
	{
		int subtraction = 0;
		try{
			subtraction = num1-num2;
		}catch(Exception e) {
			System.out.println("e = " + e);
	    }
		return subtraction;
	}
	public int multiply(int num1, int num2)
	{
		int multiplication = 0;
		try{
			multiplication = num1 * num2;
		}catch(Exception e){
			System.out.println("e = " + e);
		}

		return multiplication;
	}
	public int divide(int num1, int num2)
	{
		//write the code and handle the ArithmeticException
		int division = 0;
		try{
			division = num1/num2;
		}catch(ArithmeticException e){
			System.out.println("e = " + e);
	   }
         return division;

	}
	public int modulo(int num1, int num2)
	{
		int module = 0;
		try{
			module = num1%num2;
		}catch (Exception e){
			System.out.println("e = " + e);
		}
		return module;
	}
}
