// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class CreateWebhookContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebhookContactResponseBody body;

    public static CreateWebhookContactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookContactResponse self = new CreateWebhookContactResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebhookContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebhookContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebhookContactResponse setBody(CreateWebhookContactResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebhookContactResponseBody getBody() {
        return this.body;
    }

}
