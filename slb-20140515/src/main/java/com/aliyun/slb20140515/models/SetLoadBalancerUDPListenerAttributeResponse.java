// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerUDPListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetLoadBalancerUDPListenerAttributeResponseBody body;

    public static SetLoadBalancerUDPListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerUDPListenerAttributeResponse self = new SetLoadBalancerUDPListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerUDPListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerUDPListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerUDPListenerAttributeResponse setBody(SetLoadBalancerUDPListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerUDPListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
