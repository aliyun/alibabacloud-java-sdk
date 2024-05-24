// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateSavepointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSavepointResponseBody body;

    public static CreateSavepointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSavepointResponse self = new CreateSavepointResponse();
        return TeaModel.build(map, self);
    }

    public CreateSavepointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSavepointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSavepointResponse setBody(CreateSavepointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSavepointResponseBody getBody() {
        return this.body;
    }

}
