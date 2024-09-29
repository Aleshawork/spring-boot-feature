package com.example.web.controller;

import com.example.web.dto.Paging;
import com.example.web.dto.PagingParam;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.annotation.RequestParamMethodArgumentResolver;

public class PagingParamResolver extends RequestParamMethodArgumentResolver {


    public PagingParamResolver(boolean useDefaultResolution) {
        super(useDefaultResolution);
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(PagingParam.class);
    }

    @Override
    protected Object resolveName(String name, MethodParameter parameter, NativeWebRequest request) throws Exception {
        return new Paging(
                Integer.parseInt(request.getParameter("limit")),
                Integer.parseInt(request.getParameter("offset"))
        );
    }
}
