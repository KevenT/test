package com.keven.dp.stategy_01;
/** 
 * @author Keven  Email:tv2014@126.com
 * @version ����ʱ�䣺2019-3-19 ����4:07:57 
 * ˵�� :
 */
public class StategyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expString = "8+4";
		ICalculator calculator = new Plus();
		System.out.print(calculator.calculate(expString));

	}

}
