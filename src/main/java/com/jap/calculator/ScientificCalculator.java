package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if(num <= 0){
			throw new CalculatorException("number cannot be equal to or less than 0");
		}else{
			num = (int)num;
		}
		//or else call ceil method of Math class and return the value

		return num;
	}

	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message

		if(num <= 0){
			throw new CalculatorException("number cannot be equal to or less than 0");
		}else{
			num = (int)num + 1;
		}
		//or else call floor method of Math class and return the value
		return num;
	}

    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		long power =0;
		if(num1 < num2){
			throw new CalculatorException("number1 cannot be less than number2 ");
		}else{
			power = (long) Math.pow(num1,num2);
		}
		//else use Math pow method and return the value

		return power;
    }

    public double squareRoot(int num) throws CalculatorException
    {
		double number =0;
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if(num <= 0){
			throw new CalculatorException("number cannot be equal to or less than 0");
		}else{
			number = Math.sqrt(num);
		}
			//or else call sqrt method of Math class and return the value

		return number;
    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10);
			scientificCalculator.power(10,20);
			scientificCalculator.floorOfANumber(23.56f);
			scientificCalculator.squareRoot(23);
		} catch (CalculatorException e) {
            System.out.println("e = " + e);
			//throw new RuntimeException(e);

        }
		//Call all the methods one by one and surround them by try and respective catch blocks.
	}
}
