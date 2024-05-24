// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerDeleteProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLoadBalancerDeleteProtectionResponseBody body;

    public static SetLoadBalancerDeleteProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerDeleteProtectionResponse self = new SetLoadBalancerDeleteProtectionResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerDeleteProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerDeleteProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerDeleteProtectionResponse setBody(SetLoadBalancerDeleteProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerDeleteProtectionResponseBody getBody() {
        return this.body;
    }

}
