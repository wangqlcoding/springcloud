package com.ai.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: wangql
 * @Date: 2019/4/23 15:57
 * @Description:
 */
@Component
public class TokenFilter extends ZuulFilter {


    @Override
    public boolean isStaticFilter() {
        return super.isStaticFilter();
    }

    @Override
    public String disablePropertyName() {
        return super.disablePropertyName();
    }

    @Override
    public boolean isFilterDisabled() {
        return super.isFilterDisabled();
    }

    @Override
    public ZuulFilterResult runFilter() {
        return super.runFilter();
    }

    @Override
    public int compareTo(ZuulFilter filter) {
        return super.compareTo(filter);
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    //业务逻辑
    @Override
    public Object run() throws ZuulException {
        //获取上下文
        RequestContext context = RequestContext.getCurrentContext();//获取当前上下文
        //获取request
        HttpServletRequest request = context.getRequest();
        HttpServletRequest req;
        HttpServletResponse resp;
        //获取token
        String userTokten = request.getParameter("userTokten");
        return null;
    }

    //过滤类型pre 标识在请求之前进行执行
    @Override
    public String filterType() {
        return "pre";
    }

    //过滤器执行的顺序，当一个请求在同一个阶段的时候存在多个过滤器的时候，多个过滤器执行顺序
    @Override
    public int filterOrder() {
        return 0;
    }
}