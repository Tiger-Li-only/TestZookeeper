package com.company;

import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.data.Stat;

import java.util.List;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class MyChildren2Callback implements AsyncCallback.Children2Callback {
    @Override
    public void processResult(int i, String s, Object o, List<String> strings, Stat stat) {
        System.out.println("异步获取子节点列表，状态码="+i+",路径="+s+",子节点列表="+strings+",stat="+stat);
    }
}
