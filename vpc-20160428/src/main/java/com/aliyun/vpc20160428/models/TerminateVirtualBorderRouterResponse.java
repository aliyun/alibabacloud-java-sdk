// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TerminateVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateVirtualBorderRouterResponseBody body;

    public static TerminateVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateVirtualBorderRouterResponse self = new TerminateVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public TerminateVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateVirtualBorderRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateVirtualBorderRouterResponse setBody(TerminateVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
