// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLoadBalancerAttributeResponseBody body;

    public static UpdateLoadBalancerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAttributeResponse self = new UpdateLoadBalancerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLoadBalancerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLoadBalancerAttributeResponse setBody(UpdateLoadBalancerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

}
