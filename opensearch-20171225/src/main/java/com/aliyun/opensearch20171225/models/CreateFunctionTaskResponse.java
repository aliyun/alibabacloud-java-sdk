// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CreateFunctionTaskResponse setBody(CreateFunctionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFunctionTaskResponseBody getBody() {
        return this.body;
    }

}
