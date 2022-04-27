// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateLoadBalancerAttributeResponse setBody(UpdateLoadBalancerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

}
