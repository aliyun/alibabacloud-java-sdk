// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class StopLoadBalancerListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopLoadBalancerListenerResponseBody body;

    public static StopLoadBalancerListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLoadBalancerListenerResponse self = new StopLoadBalancerListenerResponse();
        return TeaModel.build(map, self);
    }

    public StopLoadBalancerListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLoadBalancerListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLoadBalancerListenerResponse setBody(StopLoadBalancerListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

}
