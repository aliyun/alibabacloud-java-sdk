// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateAgingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAgingResponseBody body;

    public static CreateAgingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgingResponse self = new CreateAgingResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgingResponse setBody(CreateAgingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgingResponseBody getBody() {
        return this.body;
    }

}
