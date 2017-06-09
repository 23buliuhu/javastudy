package com.baomidou.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.dubbo.service.DemoService;
import com.baomidou.springmvc.model.system.User;

public class DemoServiceImpl implements DemoService {  
  
    public String sayHello(String name) {  
        return "Hello " + name;  
    }  
  
    public List getUsers() {  
        List list = new ArrayList();  
        User u1 = new User();  
        u1.setName("hejingyuan");  
        u1.setAge(20);  
  
        User u2 = new User();  
        u2.setName("xvshu");  
        u2.setAge(21);  
  
          
        list.add(u1);  
        list.add(u2);  
          
        return list;  
    }  
} 