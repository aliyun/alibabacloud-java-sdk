// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateLabelsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLabelsetResponseBody body;

    public static CreateLabelsetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelsetResponse self = new CreateLabelsetResponse();
        return TeaModel.build(map, self);
    }

    public CreateLabelsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLabelsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLabelsetResponse setBody(CreateLabelsetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLabelsetResponseBody getBody() {
        return this.body;
    }

}
