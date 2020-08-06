package com.dh.Spring5.proxy;

import com.dh.Spring5.dao.UserDao;
import com.dh.Spring5.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Description 动态代理
 * @Author MrZhou
 * @Date 2020-08-03 21:37
 */
public class JDkProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDao userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDkProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

        int result = dao.add(1, 2);
        System.out.println(result);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {

    //1.把创建的是谁的代理对象，把谁传递过来
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //増强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        //通过判断不同的方法名，执行不同的增强操作
        if ("add".equals(method.getName())) {
            //方法之前
            System.out.println("方法被执行之前..." + method.getName() + ":传递的参数..." + Arrays.toString(args));

            //被增强的方法执行
            res = method.invoke(obj, args);

            //方法之后
            System.out.println("方法之后执行,,," + obj);

        } else if ("update".equals(method.getName())) {
            //方法之前
            System.out.println("方法被执行之前..." + method.getName() + ":传递的参数..." + Arrays.toString(args));

            //被增强的方法执行
            res = method.invoke(obj, args);

            //方法之后
            System.out.println("方法之后执行,,," + obj);
        }

        return res;
    }
}


