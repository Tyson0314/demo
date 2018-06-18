/**   
* @Title: BigNumAdd.java 
* @Package com.tyson.interview 
* @Description: TODO 
* @author Tyson
* @date 2018年5月31日 下午8:53:59 
* @version V1.0   
*/
package com.tyson.interview;

import java.util.Arrays;

/**  
* @ClassName: BigNumAdd  
* @Description: TODO 
* @author Tyson
* @date 2018年5月31日 下午8:53:59  
*    
*/
public class BigNumAdd {
	public void bigNumAdd(String s1, String s2) {
		if(s2.length()>s1.length()) {
			String s = s1;
			s1 = s2;
			s2 = s;
		}
		
		int index1 = s1.length()-1;
		int index2 = s2.length()-1;
		int flag = 0;
		
		int[] arr1 = new int[s1.length()];
		int[] arr2 = new int[s2.length()];
		for(int i=0;i<s1.length();i++) {
			arr1[i] = Integer.valueOf(s1.charAt(i) + "");
		}
		System.out.println(Arrays.toString(arr1));
		for(int j=0;j<s2.length();j++) {
			arr2[j] = Integer.valueOf(s2.charAt(j) + "");
		}
		System.out.println(Arrays.toString(arr2));
		while(index2>=0) {
			int tmp = arr1[index1] + arr2[index2] + flag;
			if(tmp>=10) {
				flag = 1;
				arr1[index1] = tmp - 10;
			} else {
				flag = 0;
				arr1[index1] = tmp;
			}	
			index1--;
			index2--;
		}
		
		for(int m=index1-1;m>=0;m--) {
			if(flag == 0)
				break;
			arr1[m] = arr1[m] + 1;
			if(arr1[m]>=10) {
				flag = 1;
				arr1[m] = arr1[m] - 10;
			} else {
				flag = 0;
			}
		}
		
		if(flag == 1) {
			int[] arr = new int[arr1.length+1];
			arr[0] = 1;
			for(int i=0;i<arr1.length;i++) {
				arr[i+1] = arr1[i];
			}
			System.out.println(Arrays.toString(arr));
		}
		else
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void main(String[] args) {
		new BigNumAdd().bigNumAdd("999999999999", "111255812123");
		//System.out.println((int)'9');	//'0'-->48   '9'-->57
	}
}
