/**   
* @Title: CompositionOrExtend.java 
* @Package com.tyson.test 
* @Description: TODO 
* @author Tyson
* @date 2018年5月16日 下午7:11:49 
* @version V1.0   
*/
package com.tyson.test;

/**  
* @ClassName: CompositionOrExtend  
* @Description: TODO 
* @author Tyson
* @date 2018年5月16日 下午7:11:49  
*    
*/
public class CompositionOrExtend {
	
	public static void main(String[] args) {
		Flyer bird = new Bird();
		Bird1 bird1 = new Bird1(new Flyer());
		
		bird.fly();
		bird1.fly();
	}
}

interface Fly {
	public abstract void fly();
}

class Flyer implements Fly {

	/* 
	* Title: fly 
	* Description:
	* @see com.tyson.test.Fly#fly()  
	*/
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly in the sky!!!");
	}
	
}

class Bird extends Flyer {
	private String furColor;
}

class Bird1 {
	private Flyer flyer;
	
	public Bird1(Flyer flyer) {
		this.flyer = flyer;
	}
	
	public void fly() {
		flyer.fly();
	}
}
