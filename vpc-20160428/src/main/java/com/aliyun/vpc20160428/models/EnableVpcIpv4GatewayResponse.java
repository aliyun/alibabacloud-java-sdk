// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableVpcIpv4GatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableVpcIpv4GatewayResponseBody body;

    public static EnableVpcIpv4GatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcIpv4GatewayResponse self = new EnableVpcIpv4GatewayResponse();
        return TeaModel.build(map, self);
    }

    public EnableVpcIpv4GatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableVpcIpv4GatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableVpcIpv4GatewayResponse setBody(EnableVpcIpv4GatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableVpcIpv4GatewayResponseBody getBody() {
        return this.body;
    }

}
