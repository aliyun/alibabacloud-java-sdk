// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class EnableSmartAccessGatewayUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSmartAccessGatewayUserResponseBody body;

    public static EnableSmartAccessGatewayUserResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSmartAccessGatewayUserResponse self = new EnableSmartAccessGatewayUserResponse();
        return TeaModel.build(map, self);
    }

    public EnableSmartAccessGatewayUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSmartAccessGatewayUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSmartAccessGatewayUserResponse setBody(EnableSmartAccessGatewayUserResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSmartAccessGatewayUserResponseBody getBody() {
        return this.body;
    }

}
