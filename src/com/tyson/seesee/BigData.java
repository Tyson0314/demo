/**   
* @Title: BigIntegerDemo.java 
* @Package com.tyson.seesee 
* @Description: TODO 
* @author Tyson
* @date 2018年5月25日 下午11:29:12 
* @version V1.0   
*/
package com.tyson.seesee;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**  
* @ClassName: BigIntegerDemo  
* @Description: TODO 
* @author Tyson
* @date 2018年5月25日 下午11:29:12  
*    
*/
public class BigData {
	@Test
	public void test() {
		BigInteger b1 = new BigInteger("123");
		BigInteger b2 = new BigInteger("666");
		
		BigDecimal b3 = new BigDecimal("123.2");
		BigDecimal b4 = new BigDecimal("456.2");
		
		System.out.println(b1.pow(1));
		System.out.println(b1.divide(b2).toString());
		System.out.println(b1.add(b2));
		System.out.println();
		System.out.println(b3.multiply(b4));
	}
	@Test
	public void test1() {
		String str = "45";
		BigInteger b1 = new BigInteger("16");
		BigInteger result = new BigInteger("0");
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(str.length()-i-1);
			if(c>='a'&&c<='f') {
				BigInteger tmp = b1.pow(i).multiply(
						new BigInteger(Integer.toString(c - 'a' + 10)));
				result = result.add(tmp);
			} else {
				BigInteger tmp = b1.pow(i).multiply(
						new BigInteger(Character.toString(c)));
				result = result.add(tmp);
			}
		}
		
		System.out.println(result.toString());
	}
}
