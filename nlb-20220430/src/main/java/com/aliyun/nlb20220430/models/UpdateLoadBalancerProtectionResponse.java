// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLoadBalancerProtectionResponseBody body;

    public static UpdateLoadBalancerProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerProtectionResponse self = new UpdateLoadBalancerProtectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLoadBalancerProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLoadBalancerProtectionResponse setBody(UpdateLoadBalancerProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoadBalancerProtectionResponseBody getBody() {
        return this.body;
    }

}
