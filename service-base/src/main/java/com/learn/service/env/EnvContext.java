package com.learn.service.env;

/**
 * @author ：河神
 * @date ：Created in 2021/9/25 6:16 下午
 */
public class EnvContext {

    private static volatile String env = null;

    public static String getEnv() {
        return env;
    }

    public static void setEnv(String env) {
        EnvContext.env = env;
    }
}
