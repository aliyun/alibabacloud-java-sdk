// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadAllWebhookContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadAllWebhookContactsResponseBody body;

    public static ReadAllWebhookContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadAllWebhookContactsResponse self = new ReadAllWebhookContactsResponse();
        return TeaModel.build(map, self);
    }

    public ReadAllWebhookContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadAllWebhookContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadAllWebhookContactsResponse setBody(ReadAllWebhookContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadAllWebhookContactsResponseBody getBody() {
        return this.body;
    }

}
