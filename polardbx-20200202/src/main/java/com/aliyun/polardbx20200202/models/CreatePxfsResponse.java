// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePxfsResponseBody body;

    public static CreatePxfsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsResponse self = new CreatePxfsResponse();
        return TeaModel.build(map, self);
    }

    public CreatePxfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePxfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePxfsResponse setBody(CreatePxfsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePxfsResponseBody getBody() {
        return this.body;
    }

}
