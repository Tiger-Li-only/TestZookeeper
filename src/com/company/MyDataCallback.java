package com.company;

import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.data.Stat;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class MyDataCallback implements AsyncCallback.DataCallback {
    @Override
    public void processResult(int i, String s, Object o, byte[] bytes, Stat stat) {
            System.out.println("异步获取路径："+s+"下的数据，返回码="+i+",上下文参数="+o+",数据="+new String(bytes)+",stat="+stat);
    }
}
