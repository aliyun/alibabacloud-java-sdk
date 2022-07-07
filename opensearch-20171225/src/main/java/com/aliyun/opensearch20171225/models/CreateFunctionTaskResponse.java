// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFunctionTaskResponseBody body;

    public static CreateFunctionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionTaskResponse self = new CreateFunctionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateFunctionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFunctionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFunctionTaskResponse setBody(CreateFunctionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFunctionTaskResponseBody getBody() {
        return this.body;
    }

}
