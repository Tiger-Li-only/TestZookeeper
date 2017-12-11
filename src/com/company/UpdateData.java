package com.company;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class UpdateData {

    /**
     * 更新节点数据
     * @param nodePath
     */
    public void updateDataSync(String nodePath){
        try {
            Stat stat = CreateSession.zooKeeper.setData(nodePath,"999".getBytes(),-1);
            System.out.println("修改节点信息stat="+stat);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新节点数据
     * @param nodePath
     */
    public void updateDataASync(String nodePath){
        CreateSession.zooKeeper.setData(nodePath,"999".getBytes(),-1,new MyStatCallback(),"异步更新数据上下文对象");
    }
}
