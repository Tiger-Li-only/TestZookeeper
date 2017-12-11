package com.company;

import org.apache.zookeeper.AsyncCallback;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class MyStringCallback implements AsyncCallback.StringCallback{
    @Override
    public void processResult(int i, String s, Object o, String s2) {
        System.out.println("返回码="+i+",需要创建的节点路径="+s+",异步调用的上下文="+o+",节点的真实路径="+s2);
    }
}
