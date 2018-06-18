/**   
* @Title: StackPeek.java 
* @Package com.tyson.test 
* @Description: TODO 
* @author Tyson
* @date 2018年5月21日 上午8:14:46 
* @version V1.0   
*/
package com.tyson.test;

import java.util.Stack;

import org.junit.Test;

/**  
* @ClassName: StackPeek  
* @Description: TODO 
* @author Tyson
* @date 2018年5月21日 上午8:14:46  
*    
*/
public class StackEmptyPeek {
	public void stackEmptyPeek() {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.pop();
		s.peek();
	}
	
	@Test
	public void test() {
		StackEmptyPeek sep = new StackEmptyPeek();
		
		sep.stackEmptyPeek();
	}
}

