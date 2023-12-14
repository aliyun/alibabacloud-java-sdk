// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayLoggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGatewayLoggingResponseBody body;

    public static CreateGatewayLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayLoggingResponse self = new CreateGatewayLoggingResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayLoggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayLoggingResponse setBody(CreateGatewayLoggingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayLoggingResponseBody getBody() {
        return this.body;
    }

}
