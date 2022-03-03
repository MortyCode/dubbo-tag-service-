package com.learn.service.duuboext.log;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.InvokerListener;
import org.apache.dubbo.rpc.RpcException;

/**
 *  当有服务引用时，触发该事件。
 *
 * @author ：河神
 * @date ：Created in 2021/9/23 4:15 下午
 */
@Activate
public class HsInvokerListener implements InvokerListener {

    @Override
    public void referred(Invoker<?> invoker) throws RpcException {
        System.out.println("HsInvokerListener referred"+invoker.getInterface().getName());
    }

    @Override
    public void destroyed(Invoker<?> invoker) {
        System.out.println("HsInvokerListener destroyed");
    }
}
