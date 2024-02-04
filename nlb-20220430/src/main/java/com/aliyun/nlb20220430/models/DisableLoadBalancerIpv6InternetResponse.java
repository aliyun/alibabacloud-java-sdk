// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DisableLoadBalancerIpv6InternetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableLoadBalancerIpv6InternetResponseBody body;

    public static DisableLoadBalancerIpv6InternetResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLoadBalancerIpv6InternetResponse self = new DisableLoadBalancerIpv6InternetResponse();
        return TeaModel.build(map, self);
    }

    public DisableLoadBalancerIpv6InternetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableLoadBalancerIpv6InternetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableLoadBalancerIpv6InternetResponse setBody(DisableLoadBalancerIpv6InternetResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableLoadBalancerIpv6InternetResponseBody getBody() {
        return this.body;
    }

}
