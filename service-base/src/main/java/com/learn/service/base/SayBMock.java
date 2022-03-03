package com.learn.service.base;

import org.springframework.stereotype.Service;

/**
 * @author ：河神
 * @date ：Created in 2022/3/1 11:00 上午
 */
public class SayBMock implements SayB {
    @Override
    public String say(String say) {
        return "mock";
    }
}
