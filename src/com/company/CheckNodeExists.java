package com.company;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class CheckNodeExists {
    /**
     * 同步节点检测
     * @param nodePath
     */
    public void checkNodeExistsSync(String nodePath){
        try {
            Stat stat = CreateSession.zooKeeper.exists(nodePath,true);
            System.out.println("同步节点检测stat="+stat);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 异步节点检测
     * @param nodePath
     */
    public void checkNodeExistsASync(String nodePath){
          CreateSession.zooKeeper.exists(nodePath,true,new MyStatCallback(),"异步节点检测上下文对象");
    }
}
