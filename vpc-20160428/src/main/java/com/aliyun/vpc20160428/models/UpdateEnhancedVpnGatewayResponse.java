// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateEnhancedVpnGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnhancedVpnGatewayResponseBody body;

    public static UpdateEnhancedVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnhancedVpnGatewayResponse self = new UpdateEnhancedVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnhancedVpnGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnhancedVpnGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnhancedVpnGatewayResponse setBody(UpdateEnhancedVpnGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnhancedVpnGatewayResponseBody getBody() {
        return this.body;
    }

}
