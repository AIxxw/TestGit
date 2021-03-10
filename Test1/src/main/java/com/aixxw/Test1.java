package com.aixxw;

import cn.hutool.core.util.StrUtil;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("ssss");
        String tel = "13673593518";
        String hide = StrUtil.hide(tel, 3, tel.length() - 4);
        System.out.println(hide);
        System.out.println(tel);
        int i = tel.indexOf(tel);
        System.out.println(i);
    }
}
