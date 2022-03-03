package com.learn.service.env;

/**
 * @author ：河神
 * @date ：Created in 2021/9/25 6:28 下午
 */
public class EnvThreadLocalData {

    private static final ThreadLocal<String> PARAM_CONTAINER = new ThreadLocal<>();


    public static String getParam() {
        return PARAM_CONTAINER.get();
    }

    public static void setParam(String param) {
        PARAM_CONTAINER.set(param);
    }

    public static void clearParam() {
        PARAM_CONTAINER.remove();
    }


}
