// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreatePocSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePocSampleResponseBody body;

    public static CreatePocSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePocSampleResponse self = new CreatePocSampleResponse();
        return TeaModel.build(map, self);
    }

    public CreatePocSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePocSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePocSampleResponse setBody(CreatePocSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePocSampleResponseBody getBody() {
        return this.body;
    }

}
