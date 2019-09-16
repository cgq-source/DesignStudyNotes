package com.cgq.lib.design.proxy;

public class Agent2 implements Subject2 {

    private Subject2 star;

    public Agent2(Subject2 star) {
        this.star = star;
    }

    @Override
    public void movie() {
        System.out.println(getClass().getSimpleName()+": 接了一部不错的剧本...");
        if (null!=star){
            star.movie();
        }
    }

    @Override
    public Subject2 getAgent() {
        return this;
    }
}
