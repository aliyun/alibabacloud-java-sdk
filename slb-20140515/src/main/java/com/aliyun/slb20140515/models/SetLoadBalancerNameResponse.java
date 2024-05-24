// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLoadBalancerNameResponseBody body;

    public static SetLoadBalancerNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerNameResponse self = new SetLoadBalancerNameResponse();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoadBalancerNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoadBalancerNameResponse setBody(SetLoadBalancerNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoadBalancerNameResponseBody getBody() {
        return this.body;
    }

}
