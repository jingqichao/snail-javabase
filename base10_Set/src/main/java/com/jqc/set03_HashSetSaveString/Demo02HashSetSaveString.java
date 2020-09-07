package com.jqc.set03_HashSetSaveString;

import java.util.HashSet;

/*
    Set集合不允许存储重复元素的原理
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        //先使用hashCode方法计算哈希值，如果哈希值相同（哈希冲突），然后再调用equals判断两个元素是否相同。如果不同，则保存
        set.add(s2);
        set.add("重地");
        //先使用hashCode方法计算哈希值，如果哈希值相同（哈希冲突），然后再调用equals判断两个元素是否相同。如果不同，则保存
        set.add("通话");
        //先使用hashCode方法计算哈希值，如果哈希值相同（哈希冲突），然后再调用equals判断两个元素是否相同。如果不同，则保存
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }

}
