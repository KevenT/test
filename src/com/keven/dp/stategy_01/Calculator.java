package com.keven.dp.stategy_01;
/** 
 * @author Keven  Email:tv2014@126.com
 * @version ����ʱ�䣺2019-3-19 ����3:54:30 
 * ˵�� :�����࣬ʵ��һЩ���ܵķ����������ȷ���
 */
public abstract class Calculator {
	
	public int [] parser(String exp,String opt){
		String array[] = exp.split(opt);
		int arrayInt [] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}

}
