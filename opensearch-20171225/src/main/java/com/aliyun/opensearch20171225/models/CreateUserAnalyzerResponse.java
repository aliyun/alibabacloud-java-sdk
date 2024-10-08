// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateUserAnalyzerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserAnalyzerResponseBody body;

    public static CreateUserAnalyzerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAnalyzerResponse self = new CreateUserAnalyzerResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserAnalyzerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserAnalyzerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserAnalyzerResponse setBody(CreateUserAnalyzerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserAnalyzerResponseBody getBody() {
        return this.body;
    }

}
