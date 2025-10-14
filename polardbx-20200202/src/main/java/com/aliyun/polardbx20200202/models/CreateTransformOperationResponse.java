// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateTransformOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransformOperationResponseBody body;

    public static CreateTransformOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransformOperationResponse self = new CreateTransformOperationResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransformOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransformOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransformOperationResponse setBody(CreateTransformOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransformOperationResponseBody getBody() {
        return this.body;
    }

}
