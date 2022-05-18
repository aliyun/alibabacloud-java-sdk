// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateConstraintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConstraintResponseBody body;

    public static CreateConstraintResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConstraintResponse self = new CreateConstraintResponse();
        return TeaModel.build(map, self);
    }

    public CreateConstraintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConstraintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConstraintResponse setBody(CreateConstraintResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConstraintResponseBody getBody() {
        return this.body;
    }

}
