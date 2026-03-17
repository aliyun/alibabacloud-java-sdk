// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindSmartAccessGatewayResponseBody body;

    public static UnbindSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSmartAccessGatewayResponse self = new UnbindSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSmartAccessGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindSmartAccessGatewayResponse setBody(UnbindSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
