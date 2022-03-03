package com.learn.service.duuboext.autoRoute.config;

import com.learn.service.env.EnvContext;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.cluster.configurator.AbstractConfigurator;

/**
 * @author ：河神
 * @date ：Created in 2021/9/24 12:51 上午
 */
public class ExtHsConfigurator extends AbstractConfigurator {

    public static final String TAG_KEY = "tag";


    public ExtHsConfigurator(URL url) {
        super(url);
    }

    @Override
    protected URL doConfigure(URL currentUrl, URL configUrl) {
        currentUrl = currentUrl.removeParameter(TAG_KEY);
        currentUrl = currentUrl.addParameter(TAG_KEY,  EnvContext.getEnv());
        currentUrl = currentUrl.addParameter("EXT_YOUXIU",  "优秀的河神");
        return currentUrl;
    }

}
