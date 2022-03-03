package com.learn.service.duuboext.balance;

import com.learn.service.env.EnvThreadLocalData;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.LoadBalance;
import org.apache.dubbo.rpc.cluster.loadbalance.RandomLoadBalance;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：河神
 * @date ：Created in 2021/9/25 5:58 下午
 */
public class HsLoadBalance implements LoadBalance {

    @Override
    public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        System.out.println("HsLoadBalance");
        return new RandomLoadBalance().select(invokers,url,invocation);
    }
}
