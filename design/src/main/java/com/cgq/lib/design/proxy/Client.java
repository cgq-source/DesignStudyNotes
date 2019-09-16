package com.cgq.lib.design.proxy;

public class Client {
    public static void main(String[] args) {
//        way1();
        way2();
    }

    public static void way1(){
        Subject star = new Star();
        Subject agent = new Agent(star);
        agent.movie();
    }

    public static void way2(){
        Subject2 star=new Star2();
        Subject2 agent=star.getAgent();
        agent.movie();
    }
}
