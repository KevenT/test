package com.keven.dp.stategy_01;
/** 
 * @author Keven  Email:tv2014@126.com
 * @version ����ʱ�䣺2019-3-19 ����4:04:56 
 * ˵�� :
 */
public class Minus extends Calculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int arrayInt[] = parser(exp, "\\-");
		return arrayInt[0]-arrayInt[1];
	}

}
