// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class CreateApiMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApiMcpServerResponseBody body;

    public static CreateApiMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiMcpServerResponse self = new CreateApiMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApiMcpServerResponse setBody(CreateApiMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiMcpServerResponseBody getBody() {
        return this.body;
    }

}
