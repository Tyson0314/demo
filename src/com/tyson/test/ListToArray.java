/**   
* @Title: ListToArray.java 
* @Package com.tyson.test 
* @Description: TODO 
* @author Tyson
* @date 2018年6月8日 下午3:10:37 
* @version V1.0   
*/
package com.tyson.test;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

/**  
* @ClassName: ListToArray  
* @Description: TODO 
* @author Tyson
* @date 2018年6月8日 下午3:10:37  
*    
*/
public class ListToArray {
	@Test
	public void listToArray() {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		Integer[] intArr = l1.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(intArr));
		
		int sum = 0;
		System.out.println((sum += 1)>0);
	}
}
