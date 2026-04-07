// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateEnhancedVpnGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEnhancedVpnGatewayResponseBody body;

    public static CreateEnhancedVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnhancedVpnGatewayResponse self = new CreateEnhancedVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnhancedVpnGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnhancedVpnGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnhancedVpnGatewayResponse setBody(CreateEnhancedVpnGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnhancedVpnGatewayResponseBody getBody() {
        return this.body;
    }

}
