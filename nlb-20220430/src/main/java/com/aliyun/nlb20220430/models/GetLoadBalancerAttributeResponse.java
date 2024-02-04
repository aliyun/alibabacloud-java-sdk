// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetLoadBalancerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLoadBalancerAttributeResponseBody body;

    public static GetLoadBalancerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoadBalancerAttributeResponse self = new GetLoadBalancerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetLoadBalancerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoadBalancerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoadBalancerAttributeResponse setBody(GetLoadBalancerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

}
