// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSmartAccessGatewayResponseBody body;

    public static CreateSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewayResponse self = new CreateSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmartAccessGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmartAccessGatewayResponse setBody(CreateSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
