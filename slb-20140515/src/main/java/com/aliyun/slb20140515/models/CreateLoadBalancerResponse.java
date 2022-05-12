// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLoadBalancerResponseBody body;

    public static CreateLoadBalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerResponse self = new CreateLoadBalancerResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadBalancerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLoadBalancerResponse setBody(CreateLoadBalancerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadBalancerResponseBody getBody() {
        return this.body;
    }

}
