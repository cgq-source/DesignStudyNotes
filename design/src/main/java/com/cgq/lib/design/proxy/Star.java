package com.cgq.lib.design.proxy;

public class Star implements Subject{
    @Override
    public void movie() {
        System.out.println(getClass().getSimpleName()+": 我负责拍电影就好了！");
    }
}
