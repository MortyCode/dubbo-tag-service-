package com.learn.service.duuboext.log.filter;

import com.alibaba.fastjson.JSON;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.rpc.RpcException;

/**
 * @author ：河神
 * @date ：Created in 2021/9/23 12:57 上午
 */
public class HsFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Object[] arguments = invocation.getArguments();
        String methodName = invocation.getMethodName();
        System.out.println( "HsFilter ["+methodName+"]参数：{"+ JSON.toJSONString(arguments)+"}");
        return invoker.invoke(invocation);
    }

}
