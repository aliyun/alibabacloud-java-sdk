// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerTCPListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLoadBalancerTCPListenerResponseBody body;

    public static CreateLoadBalancerTCPListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerTCPListenerResponse self = new CreateLoadBalancerTCPListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerTCPListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadBalancerTCPListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLoadBalancerTCPListenerResponse setBody(CreateLoadBalancerTCPListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadBalancerTCPListenerResponseBody getBody() {
        return this.body;
    }

}
