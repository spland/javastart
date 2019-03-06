package com.shuangye.freemarker;


import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * create by xxie
 * on 2019/1/21
 */

public class ThreadTest {

    private String a;
    public static void main(String[] args) {


    }
    public ThreadTest(String a){
        this.a=a;
    }
    public String getA() {
        return a;
    }


}
