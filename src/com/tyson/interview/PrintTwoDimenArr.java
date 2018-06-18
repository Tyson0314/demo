/**   
* @Title: PrintTwoDimenArr.java 
* @Package com.tyson.interview 
* @Description: TODO 
* @author Tyson
* @date 2018年5月31日 下午8:11:44 
* @version V1.0   
*/
package com.tyson.interview;

/**  
* @ClassName: PrintTwoDimenArr  
* @Description: TODO 
* @author Tyson
* @date 2018年5月31日 下午8:11:44  
*    
*/
public class PrintTwoDimenArr {
	public void printArr(int[][] arr) {
		int i = 0, j = 0;
		int flag = 1;
		System.out.println(arr[0][0]);
		while(i<arr.length&&j<arr[0].length) {
			if((j == 0&&i==0) || (j == arr[0].length - 1&&i==0))
				i++;
			else
				j++;
			
			if(i>=arr.length||j>=arr[0].length)
				break;
			
			if(flag == 1) {
				while(i>0 && j<arr[0].length) {
					System.out.println(arr[i][j]);
					i--;
					j++;
				}
				if(i>=0 && j<arr[0].length)
					System.out.println(arr[i][j]);
				flag = 0;
			} else {
				while(i<arr.length-1 && j>0) {
					System.out.println(arr[i][j]);
					i++;
					j--;
				}
				if(i<=arr.length-1 && j>=0)
					System.out.println(arr[i][j]);
				flag = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {
				{1,3,4,9},
				{2,5,8,10},
				{6,7,11,12}
		};
		
		new PrintTwoDimenArr().printArr(arr);
	}
}
