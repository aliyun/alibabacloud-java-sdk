// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableVpcIpv4GatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableVpcIpv4GatewayResponse setBody(EnableVpcIpv4GatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableVpcIpv4GatewayResponseBody getBody() {
        return this.body;
    }

}
