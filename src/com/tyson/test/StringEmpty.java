/**   
* @Title: StringEmpty.java 
* @Package com.tyson.test 
* @Description: TODO 
* @author Tyson
* @date 2018年6月7日 上午8:57:53 
* @version V1.0   
*/
package com.tyson.test;

import org.junit.Test;

/**  
* @ClassName: StringEmpty  
* @Description: TODO 
* @author Tyson
* @date 2018年6月7日 上午8:57:53  
*    
*/
public class StringEmpty {
	@Test
	public void test() {
		String str = "";
		
		if(str.equals(""))
			System.out.println("\"" + str + "\"");
		System.out.println(str.length());
	}
}
