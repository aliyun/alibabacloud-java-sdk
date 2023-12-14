// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class GenerateGatewayTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateGatewayTokenResponseBody body;

    public static GenerateGatewayTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateGatewayTokenResponse self = new GenerateGatewayTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateGatewayTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateGatewayTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateGatewayTokenResponse setBody(GenerateGatewayTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateGatewayTokenResponseBody getBody() {
        return this.body;
    }

}
