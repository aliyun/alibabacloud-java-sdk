// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFunctionInstanceResponseBody body;

    public static CreateFunctionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionInstanceResponse self = new CreateFunctionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateFunctionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFunctionInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFunctionInstanceResponse setBody(CreateFunctionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFunctionInstanceResponseBody getBody() {
        return this.body;
    }

}
