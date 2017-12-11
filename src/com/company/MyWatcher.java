package com.company;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * Created by Administrator on 2017-12-11 0011.
 */
public class MyWatcher implements Watcher {
    @Override
    public void process(WatchedEvent watchedEvent) {
        System.out.println("收到事件:"+watchedEvent);
        if (watchedEvent.getState() == Event.KeeperState.SyncConnected){
            if (watchedEvent.getType() == Event.EventType.None && null == watchedEvent.getPath()){
//                CreateNode createNode = new CreateNode();
//                createNode.createNodeSync("/node_11");  //同步创建节点
//                createNode.createNodeAsync("/node_12");  //异步创建节点
//                DeleteNode deleteNode = new DeleteNode();
//                deleteNode.deleteNodeAsync("/node_110000000005");  //异步删除
//                deleteNode.deleteNodeSync("/node_120000000006");   //同步删除
//                UpdateData updateData = new UpdateData();
//                updateData.updateDataSync("/node_1");  //同步更新节点的值
//                updateData.updateDataASync("/node_4");  //异步更新节点的值
//                GetData getData = new GetData();
//                getData.getDataAsync("/node_20");  //异步获取节点下的数据
//                getData.getDataSync("/node_20");   //同步获取节点下的数据
//                CheckNodeExists checkNodeExists = new CheckNodeExists();
//                checkNodeExists.checkNodeExistsASync("/node_1");
//                checkNodeExists.checkNodeExistsSync("/node_22");
//                GetChildrenList getChildrenList = new GetChildrenList();
//                getChildrenList.getChildrenListSync("/"); //同步获取子节点列表
//                getChildrenList.getChildrenListASync("/"); //异步获取子节点列表
            }else{
               if (watchedEvent.getType() == Event.EventType.NodeCreated){//节点创建
                    System.out.println(watchedEvent.getPath()+" created");
                   try {
                       System.out.println(CreateSession.zooKeeper.exists(watchedEvent.getPath(),true));
                   } catch (KeeperException e) {
                       e.printStackTrace();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }else if(watchedEvent.getType() == Event.EventType.NodeDataChanged){//子节点数据改变
                   System.out.println(watchedEvent.getPath()+" updated");
                   try {
                       System.out.println(CreateSession.zooKeeper.exists(watchedEvent.getPath(),true));
                   } catch (KeeperException e) {
                       e.printStackTrace();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }else if (watchedEvent.getType() == Event.EventType.NodeDeleted){//节点被删除
                   System.out.println(watchedEvent.getPath()+" deleted");
                   try {
                       System.out.println(CreateSession.zooKeeper.exists(watchedEvent.getPath(),true));
                   } catch (KeeperException e) {
                       e.printStackTrace();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }else if (watchedEvent.getType() == Event.EventType.NodeChildrenChanged){  //子节点改变
                   try {
                       System.out.println(CreateSession.zooKeeper.getChildren(watchedEvent.getPath(),true));
                   } catch (KeeperException e) {
                       e.printStackTrace();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        }
    }




}
