// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePbcSchemaResponseBody body;

    public static CreatePbcSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcSchemaResponse self = new CreatePbcSchemaResponse();
        return TeaModel.build(map, self);
    }

    public CreatePbcSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePbcSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePbcSchemaResponse setBody(CreatePbcSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePbcSchemaResponseBody getBody() {
        return this.body;
    }

}
