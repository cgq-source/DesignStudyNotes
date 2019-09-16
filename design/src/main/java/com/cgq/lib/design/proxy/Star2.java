package com.cgq.lib.design.proxy;

public class Star2 implements Subject2{
    @Override
    public void movie() {
        System.out.println(getClass().getSimpleName()+": 我负责拍电影就好了！");
    }

    @Override
    public Subject2 getAgent() {
        return new Agent2(this);
    }
}
