// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSampleResponseBody body;

    public static CreateSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleResponse self = new CreateSampleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSampleResponse setBody(CreateSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSampleResponseBody getBody() {
        return this.body;
    }

}
