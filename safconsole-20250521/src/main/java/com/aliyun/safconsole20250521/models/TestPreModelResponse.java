// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class TestPreModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestPreModelResponseBody body;

    public static TestPreModelResponse build(java.util.Map<String, ?> map) throws Exception {
        TestPreModelResponse self = new TestPreModelResponse();
        return TeaModel.build(map, self);
    }

    public TestPreModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestPreModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestPreModelResponse setBody(TestPreModelResponseBody body) {
        this.body = body;
        return this;
    }
    public TestPreModelResponseBody getBody() {
        return this.body;
    }

}
