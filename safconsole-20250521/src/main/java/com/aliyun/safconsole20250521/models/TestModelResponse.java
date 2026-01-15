// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class TestModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestModelResponseBody body;

    public static TestModelResponse build(java.util.Map<String, ?> map) throws Exception {
        TestModelResponse self = new TestModelResponse();
        return TeaModel.build(map, self);
    }

    public TestModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestModelResponse setBody(TestModelResponseBody body) {
        this.body = body;
        return this;
    }
    public TestModelResponseBody getBody() {
        return this.body;
    }

}
