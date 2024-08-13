package com.lee.spring6.iocxml.bean.itf;

public class PersonDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("person run....");
    }
}
