// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class UpdateWebhookContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWebhookContactResponseBody body;

    public static UpdateWebhookContactResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebhookContactResponse self = new UpdateWebhookContactResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebhookContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebhookContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebhookContactResponse setBody(UpdateWebhookContactResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWebhookContactResponseBody getBody() {
        return this.body;
    }

}
