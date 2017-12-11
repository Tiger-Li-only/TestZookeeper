package com.company;

import org.apache.zookeeper.AsyncCallback;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class MyVoidCallback implements AsyncCallback.VoidCallback {
    @Override
    public void processResult(int i, String s, Object o) {
        System.out.println("异步删除节点返回码="+i+",删除路径="+s+",上下文="+o);
    }
}
