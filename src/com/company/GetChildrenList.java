package com.company;

import org.apache.zookeeper.KeeperException;

import java.util.List;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class GetChildrenList {
    /**
     * 同步获取子节点列表
     * @param nodePath
     */
    public void getChildrenListSync(String nodePath){
        try {
            List<String> children = CreateSession.zooKeeper.getChildren(nodePath,true);
            System.out.println(nodePath+"下的子节点列表=");
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 异步获取子节点列表
     * @param nodePath
     */
    public void getChildrenListASync(String nodePath){
          CreateSession.zooKeeper.getChildren(nodePath,true,new MyChildren2Callback(),"异步获取子节点列表上下文");
    }
}
