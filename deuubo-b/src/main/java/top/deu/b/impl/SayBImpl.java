package top.deu.b.impl;

import com.learn.service.base.SayB;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author ：河神
 * @date ：Created in 2021/9/28 3:58 下午
 */
@DubboService
public class SayBImpl implements SayB {
    @Override
    public String say(String say) {
        return "ServiceB:"+say;
    }
}
