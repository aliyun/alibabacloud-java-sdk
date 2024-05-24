// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerUDPListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLoadBalancerUDPListenerResponseBody body;

    public static CreateLoadBalancerUDPListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerUDPListenerResponse self = new CreateLoadBalancerUDPListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerUDPListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadBalancerUDPListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLoadBalancerUDPListenerResponse setBody(CreateLoadBalancerUDPListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadBalancerUDPListenerResponseBody getBody() {
        return this.body;
    }

}
