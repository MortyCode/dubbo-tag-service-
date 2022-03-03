package top.deu.b.api;

import com.learn.service.base.SayA;
import com.learn.service.env.EnvThreadLocalData;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：河神
 * @date ：Created in 2021/9/24 2:28 下午
 */
@RestController
public class SayApi {

    @DubboReference
    private SayA sayA;

    @RequestMapping("/say")
    public String say(String s,String tag){
        return sayA.say(s);
    }
}
