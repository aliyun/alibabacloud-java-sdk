// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLoadBalancerHTTPListenerAttributeResponseBody body;

    public static SetLoadBalancerHTTPListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerHTTPListenerAttributeResponse self = new SetLoadBalancerHTTPListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setBody(SetLoadBalancerHTTPListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerHTTPListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
