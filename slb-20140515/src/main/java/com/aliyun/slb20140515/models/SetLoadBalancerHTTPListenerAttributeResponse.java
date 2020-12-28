// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetLoadBalancerHTTPListenerAttributeResponse setBody(SetLoadBalancerHTTPListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerHTTPListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
