// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class TestWebhookContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestWebhookContactResponseBody body;

    public static TestWebhookContactResponse build(java.util.Map<String, ?> map) throws Exception {
        TestWebhookContactResponse self = new TestWebhookContactResponse();
        return TeaModel.build(map, self);
    }

    public TestWebhookContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestWebhookContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestWebhookContactResponse setBody(TestWebhookContactResponseBody body) {
        this.body = body;
        return this;
    }
    public TestWebhookContactResponseBody getBody() {
        return this.body;
    }

}
