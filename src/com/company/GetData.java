package com.company;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class GetData {
    private Stat stat = new Stat();
    /**
     * 同步读取数据
     */
    public void getDataSync(String nodePath){
        try {
          String data = new String(CreateSession.zooKeeper.getData(nodePath,true,stat))  ;
          System.out.println("同步获取"+nodePath+"节点下的数据是:"+data);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 异步读取数据
     */
    public void getDataAsync(String nodePath){
         CreateSession.zooKeeper.getData(nodePath,true,new MyDataCallback(),"异步获取数据上下文");
    }
}
