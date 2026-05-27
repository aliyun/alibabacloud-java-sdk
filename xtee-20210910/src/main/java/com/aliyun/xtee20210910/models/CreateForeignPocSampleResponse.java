// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateForeignPocSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateForeignPocSampleResponseBody body;

    public static CreateForeignPocSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateForeignPocSampleResponse self = new CreateForeignPocSampleResponse();
        return TeaModel.build(map, self);
    }

    public CreateForeignPocSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateForeignPocSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateForeignPocSampleResponse setBody(CreateForeignPocSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateForeignPocSampleResponseBody getBody() {
        return this.body;
    }

}
