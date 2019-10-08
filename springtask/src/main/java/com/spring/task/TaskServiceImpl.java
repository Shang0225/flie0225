package com.spring.task;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TaskServiceImpl implements ApplicationContextAware{

	public void task1() {
		System.out.println(new Date()+"1111");
	}

	public void task2() {
		System.out.println(new Date()+"2222");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}
