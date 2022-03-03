package com.learn.service.duuboext.autoRoute.route;

import com.learn.service.env.EnvThreadLocalData;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.Router;
import org.apache.dubbo.rpc.cluster.router.AbstractRouter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：河神
 * @date ：Created in 2021/9/23 5:34 下午
 */
public class HsRouter extends AbstractRouter implements Router {

    public HsRouter(URL url) {
        this.url = url;
    }

    @Override
    public <T> List<Invoker<T>> route(List<Invoker<T>> invokers,
                                      URL url,
                                      Invocation invocation) throws RpcException {
        List<Invoker<T>> returnList = new ArrayList<>();
        for (Invoker<T> invoker : invokers) {
            URL invokerUrl = invoker.getUrl();
            String invokerTag = invokerUrl.getParameter("tag");
            if (invokerTag==null){
                continue;
            }

            String param = EnvThreadLocalData.getParam();
            if (param!=null&&param.equals(invokerTag)){
                returnList.add(invoker);
                RpcContext.getContext().setAttachment("tag",param);
                continue;
            }

            String tag =  RpcContext.getContext().getAttachment("tag");
            if (invokerTag.equals(tag)){
                returnList.add(invoker);
                RpcContext.getContext().setAttachment("tag",param);
            }
        }
        if (returnList.size()>0){
            return returnList;
        }

        return invokers;
    }


}
