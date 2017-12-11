package com.company;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class CreateNode {
    /**
     * 同步创建节点
     * @param nodePath
     */
    public void createNodeSync(String nodePath) {
        try {
            String path = CreateSession.zooKeeper.create(nodePath,"1100".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
            System.out.println("同步创建节点return path:"+path);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * 异步创建节点
     * @param nodePath
     */
    public void createNodeAsync(String nodePath){
        CreateSession.zooKeeper.create(nodePath,"1111".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL,new MyStringCallback(),"异步创建节点的上下文对象");
    }
}
