// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpnGatewayResponseBody body;

    public static CreateVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnGatewayResponse self = new CreateVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpnGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpnGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpnGatewayResponse setBody(CreateVpnGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpnGatewayResponseBody getBody() {
        return this.body;
    }

}
