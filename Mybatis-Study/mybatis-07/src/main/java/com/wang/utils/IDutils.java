package com.wang.utils;

import org.junit.Test;

import java.util.UUID;

@SuppressWarnings("all") // 抑制警告
public class IDutils {

    public static String getId() {
        //  System.out.println(IDutils.getId().toString());// acd8c90e-7991-4f9d-a924-964dc6b2a1bd 随机生成id
        return UUID.randomUUID().toString().replaceAll("-",""); // 把id里面的-换成“”
    }

    @Test
    public void test() {
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
    }
}
