package com.company;

import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.data.Stat;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class MyStatCallback implements AsyncCallback.StatCallback {
    @Override
    public void processResult(int i, String s, Object o, Stat stat) {
        System.out.println("返回码="+i+",路径="+s+",上下文对象="+o+",stat="+stat);
    }
}
