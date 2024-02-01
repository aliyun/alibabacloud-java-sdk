// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv4GatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpv4GatewayResponseBody body;

    public static CreateIpv4GatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv4GatewayResponse self = new CreateIpv4GatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpv4GatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpv4GatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpv4GatewayResponse setBody(CreateIpv4GatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpv4GatewayResponseBody getBody() {
        return this.body;
    }

}
