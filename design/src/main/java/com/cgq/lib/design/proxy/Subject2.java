package com.cgq.lib.design.proxy;

public interface Subject2 {
    public void movie();

    /**
     * 指定代理
     * @return
     */
    public Subject2 getAgent();
}
