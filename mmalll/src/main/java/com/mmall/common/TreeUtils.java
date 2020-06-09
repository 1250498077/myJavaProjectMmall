package com.mmall.common;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {

    //把一个List转成树
//    static <T> List<T> buidTree(List<T> list){
//
//        List<T> tree = new ArrayList<T>();
//        for (T node : list) {
//            if(node.getParentId() == 0){
//                tree.add((T) TreeUtils.findChild(node, list));
//            }
//        }
//        return tree;
//    }
//
//    static <T> Object findChild (T node, List<T> list){
//        for(T n : list){
//            if(n.getParentId() == node.getId()){
//                if(node.getChildren() == null){
//                    node.setChildren(new ArrayList<T>());
//                }
//                node.getChildren().add(findChild(n,list));
//            }
//        }
//        return node;
//    }

}
