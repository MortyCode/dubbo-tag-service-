package com.learn.service.interceptor;

import com.learn.service.env.EnvThreadLocalData;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：河神
 * @date ：Created in 2021/10/22 9:34 上午
 */
public class DubboEnvInterceptor implements HandlerInterceptor {


    /**
     * 进入Controller层之前拦截请求，默认是拦截所有请求
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("DubboEnvInterceptor#preHandle");
        String tag = request.getParameter("tag");
        EnvThreadLocalData.setParam(tag);
        return true;
    }

    /**
     * 处理完请求后但还未渲染试图之前进行的操作
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("DubboEnvInterceptor#postHandle");
    }

    /**
     * 视图渲染后但还未返回到客户端时的操作
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("DubboEnvInterceptor#afterCompletion");
    }
}
