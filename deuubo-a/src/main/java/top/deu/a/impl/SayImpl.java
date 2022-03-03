package top.deu.a.impl;

import com.learn.service.base.SayA;
import com.learn.service.base.SayB;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author ：河神
 * @date ：Created in 2021/9/24 2:04 下午
 */
@DubboService
public class SayImpl implements SayA {

    @DubboReference
    private SayB sayB;

    @Override
    public String say(String say) {
        return "ServiceA: +"+say +"   "+ sayB.say(say);
    }
}
