// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVariableResponseBody body;

    public static CreateVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVariableResponse self = new CreateVariableResponse();
        return TeaModel.build(map, self);
    }

    public CreateVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVariableResponse setBody(CreateVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVariableResponseBody getBody() {
        return this.body;
    }

}
