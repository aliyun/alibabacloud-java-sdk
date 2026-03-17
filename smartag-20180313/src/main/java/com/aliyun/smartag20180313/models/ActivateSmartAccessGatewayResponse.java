// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ActivateSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateSmartAccessGatewayResponseBody body;

    public static ActivateSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateSmartAccessGatewayResponse self = new ActivateSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ActivateSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateSmartAccessGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateSmartAccessGatewayResponse setBody(ActivateSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
