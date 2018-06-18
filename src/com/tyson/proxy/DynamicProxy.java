/**   
* @Title: DynamicProxy.java 
* @Package com.tyson.proxy 
* @Description: TODO 
* @author Tyson
* @date 2018年5月19日 上午9:58:01 
* @version V1.0   
*/
package com.tyson.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Stack;

/**  
* @ClassName: DynamicProxy  
* @Description: TODO 
* @author Tyson
* @date 2018年5月19日 上午9:58:01  
*    
*/
public class DynamicProxy {
	//维护一个目标对象
    private Object target;
    public DynamicProxy(Object target){
        this.target=target;
    }

   //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务2");
                        return returnValue;
                    }
                }
        );
    }
    
    public static void main(String[] args) {
    	Stack s = new Stack();
       UserDao userDao = new UserDaoImpl();
         
       UserDao proxy = (UserDao) new DynamicProxy(userDao).getProxyInstance();
       
       proxy.save();
    }
}

interface UserDao {
	void save();
}

class UserDaoImpl implements UserDao {
	public void save() {
		System.out.println("save");
	}
}