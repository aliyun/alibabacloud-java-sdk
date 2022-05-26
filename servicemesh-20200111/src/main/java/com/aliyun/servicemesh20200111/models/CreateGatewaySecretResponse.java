// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateGatewaySecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGatewaySecretResponseBody body;

    public static CreateGatewaySecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewaySecretResponse self = new CreateGatewaySecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewaySecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewaySecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewaySecretResponse setBody(CreateGatewaySecretResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewaySecretResponseBody getBody() {
        return this.body;
    }

}
