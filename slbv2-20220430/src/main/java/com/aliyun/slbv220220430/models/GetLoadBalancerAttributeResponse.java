// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class GetLoadBalancerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetLoadBalancerAttributeResponse setBody(GetLoadBalancerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

}
