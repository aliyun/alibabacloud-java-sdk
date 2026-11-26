// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestHttpEventConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestHttpEventConfigResponseBody body;

    public static TestHttpEventConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        TestHttpEventConfigResponse self = new TestHttpEventConfigResponse();
        return TeaModel.build(map, self);
    }

    public TestHttpEventConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestHttpEventConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestHttpEventConfigResponse setBody(TestHttpEventConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public TestHttpEventConfigResponseBody getBody() {
        return this.body;
    }

}
