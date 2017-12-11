package com.company;

import org.apache.zookeeper.KeeperException;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class DeleteNode {

    /**
     * 同步删除节点
     */
    public void deleteNodeSync(String nodePath){
        try {
            CreateSession.zooKeeper.delete(nodePath,-1);
            System.out.println("同步删除节点完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    /**
     * 异步删除节点
     */
    public void deleteNodeAsync(String nodePath){
     CreateSession.zooKeeper.delete(nodePath,-1,new MyVoidCallback(),"异步删除节点上下文");
    }
}
