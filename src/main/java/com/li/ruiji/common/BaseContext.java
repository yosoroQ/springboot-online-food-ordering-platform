package com.li.ruiji.common;


//基于threadlocal封装工具类，用于保存和获取当前登录用户id
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

//    设置值
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

//    获取值
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
