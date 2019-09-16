package com.cgq.lib.design.proxy;

public class Agent implements Subject {

    private Subject star;

    public Agent(Subject star) {
        this.star = star;
    }

    @Override
    public void movie() {
        System.out.println(getClass().getSimpleName()+": 接了一部不错的剧本...");
        if (null!=star){
            star.movie();
        }
    }
}
