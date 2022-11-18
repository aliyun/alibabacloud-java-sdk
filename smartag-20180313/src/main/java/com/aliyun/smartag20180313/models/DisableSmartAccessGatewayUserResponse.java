// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisableSmartAccessGatewayUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSmartAccessGatewayUserResponseBody body;

    public static DisableSmartAccessGatewayUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSmartAccessGatewayUserResponse self = new DisableSmartAccessGatewayUserResponse();
        return TeaModel.build(map, self);
    }

    public DisableSmartAccessGatewayUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSmartAccessGatewayUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSmartAccessGatewayUserResponse setBody(DisableSmartAccessGatewayUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSmartAccessGatewayUserResponseBody getBody() {
        return this.body;
    }

}
