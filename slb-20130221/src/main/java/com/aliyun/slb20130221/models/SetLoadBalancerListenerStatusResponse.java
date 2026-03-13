// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20130221.models;

import com.aliyun.tea.*;

public class SetLoadBalancerListenerStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLoadBalancerListenerStatusResponseBody body;

    public static SetLoadBalancerListenerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerListenerStatusResponse self = new SetLoadBalancerListenerStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerListenerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerListenerStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerListenerStatusResponse setBody(SetLoadBalancerListenerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerListenerStatusResponseBody getBody() {
        return this.body;
    }

}
