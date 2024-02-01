// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6GatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpv6GatewayResponseBody body;

    public static CreateIpv6GatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6GatewayResponse self = new CreateIpv6GatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpv6GatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpv6GatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpv6GatewayResponse setBody(CreateIpv6GatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpv6GatewayResponseBody getBody() {
        return this.body;
    }

}
