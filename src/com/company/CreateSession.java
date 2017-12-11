package com.company;

import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class CreateSession {
    public static ZooKeeper zooKeeper;
    public static void main(String[] args) throws IOException, InterruptedException {
        zooKeeper = new ZooKeeper("192.168.100.128:2181",5000,new MyWatcher());
        System.out.println(zooKeeper.getState());
        Thread.sleep(Integer.MAX_VALUE);
    }
}
