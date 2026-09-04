// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadWebhookContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadWebhookContactResponseBody body;

    public static ReadWebhookContactResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadWebhookContactResponse self = new ReadWebhookContactResponse();
        return TeaModel.build(map, self);
    }

    public ReadWebhookContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadWebhookContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadWebhookContactResponse setBody(ReadWebhookContactResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadWebhookContactResponseBody getBody() {
        return this.body;
    }

}
