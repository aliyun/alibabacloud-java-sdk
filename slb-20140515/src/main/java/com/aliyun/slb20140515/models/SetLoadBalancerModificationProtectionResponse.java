// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerModificationProtectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLoadBalancerModificationProtectionResponseBody body;

    public static SetLoadBalancerModificationProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerModificationProtectionResponse self = new SetLoadBalancerModificationProtectionResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerModificationProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerModificationProtectionResponse setBody(SetLoadBalancerModificationProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerModificationProtectionResponseBody getBody() {
        return this.body;
    }

}
