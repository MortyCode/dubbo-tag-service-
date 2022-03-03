package com.learn.service.duuboext.autoRoute.config;


import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.cluster.Configurator;
import org.apache.dubbo.rpc.cluster.ConfiguratorFactory;

/**
 * @author ：河神
 * @date ：Created in 2021/9/24 12:50 上午
 */
public class HsConfiguratorFactory implements ConfiguratorFactory {

    @Override
    public Configurator getConfigurator(URL url) {
        return new HsConfigurator(url);
    }
}
