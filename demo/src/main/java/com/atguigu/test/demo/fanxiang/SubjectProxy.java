package com.atguigu.test.demo.fanxiang;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler {

    private Object subject;

    public SubjectProxy(Object subject){
        this.subject=subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(subject, args);

        return invoke;
    }
}
