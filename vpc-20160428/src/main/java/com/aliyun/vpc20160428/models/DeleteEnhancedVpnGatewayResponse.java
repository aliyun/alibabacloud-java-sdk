// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteEnhancedVpnGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnhancedVpnGatewayResponseBody body;

    public static DeleteEnhancedVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnhancedVpnGatewayResponse self = new DeleteEnhancedVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnhancedVpnGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnhancedVpnGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnhancedVpnGatewayResponse setBody(DeleteEnhancedVpnGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnhancedVpnGatewayResponseBody getBody() {
        return this.body;
    }

}
