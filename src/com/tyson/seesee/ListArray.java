/**   
* @Title: ListArray.java 
* @Package com.tyson.seesee 
* @Description: TODO 
* @author Tyson
* @date 2018年5月31日 下午7:01:51 
* @version V1.0   
*/
package com.tyson.seesee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**  
* @ClassName: ListArray  
* @Description: TODO 
* @author Tyson
* @date 2018年5月31日 下午7:01:51  
*    
*/
public class ListArray {
	@Test
	public void test() {
		String[] s = {"hello", "world"};
		String str = "hello";
		char[] chars = str.toCharArray();
		int[] arr = {1, 2, 3};
		
		List<String> list =  Arrays.asList(s);
		List<char[]> listChar = Arrays.asList(chars);
		List listInt = Arrays.asList(arr);
		
		System.out.println(list);
		System.out.println(chars);
		System.out.println(listInt);
		System.out.println(listChar);
		System.out.println(listInt.size());
	}
	
	@Test
	public void test1() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		
		String[] arr = new String[list.size()];
		arr = list.toArray(new String[0]);
		
		System.out.println(Arrays.toString(arr));
	}
}
