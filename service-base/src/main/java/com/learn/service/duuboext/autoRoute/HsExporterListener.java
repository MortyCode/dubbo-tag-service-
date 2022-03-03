package com.learn.service.duuboext.autoRoute;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.registry.Registry;
import org.apache.dubbo.registry.RegistryFactory;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.ExporterListener;
import org.apache.dubbo.rpc.RpcException;
import org.springframework.core.env.Environment;

/**
 * 当有服务暴露时，触发该事件。
 * @author ：河神
 * @date ：Created in 2021/9/23 4:51 下午
 */
@Activate
public class HsExporterListener implements ExporterListener {

    private Environment environment;

    public Environment getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void exported(Exporter<?> exporter) throws RpcException {
        String zkAddress = this.environment.getProperty("dubbo.registry.address");

        RegistryFactory registryFactory = ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
        Registry registry = registryFactory.getRegistry(URL.valueOf(zkAddress));
        String face = exporter.getInvoker().getInterface().getName();

        System.out.println("HsExporterListener exported zkAddress:"+zkAddress+"  "+face);
        URL url = URL.valueOf("routers://0.0.0.0/" + face)
                .addParameters("dynamic","false")
                .addParameters("name","gray")
                .addParameters("category","routers")
                .addParameters("version","Base")
                .addParameters("runtime", "true")
                .addParameters("router","HsRouter")
        ;

        registry.register(url);

    }

    @Override
    public void unexported(Exporter<?> exporter) {
        System.out.println("HsExporterListener unexported");
    }
}
