package com.learn.service.duuboext.autoRoute.route;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.cluster.Router;
import org.apache.dubbo.rpc.cluster.RouterFactory;

/**
 * @author ：河神
 * @date ：Created in 2021/9/23 5:33 下午
 */
@Activate
public class HsRouterFactory implements RouterFactory {


    @Override
    public Router getRouter(URL url) {
        return new HsRouter(url);
    }
}
