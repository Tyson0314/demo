/**   
* @Title: JunitDemoTest.java 
* @Package com.tyson.seesee 
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 下午3:15:41 
* @version V1.0   
*/
package com.tyson.seesee;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

/**  
* @ClassName: JunitDemoTest  
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 下午3:15:41  
*    
*/
public class JunitDemoTest {

	@Test
	public void test() {
		int result = new JunitDemo().add(2, 3);
		Assert.assertEquals(6, result);  
	}

}
