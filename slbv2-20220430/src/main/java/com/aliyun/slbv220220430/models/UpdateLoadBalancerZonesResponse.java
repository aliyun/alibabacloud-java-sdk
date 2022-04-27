// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLoadBalancerZonesResponseBody body;

    public static UpdateLoadBalancerZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerZonesResponse self = new UpdateLoadBalancerZonesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLoadBalancerZonesResponse setBody(UpdateLoadBalancerZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoadBalancerZonesResponseBody getBody() {
        return this.body;
    }

}
