// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadWebhookContactSendTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadWebhookContactSendTemplateListResponseBody body;

    public static ReadWebhookContactSendTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadWebhookContactSendTemplateListResponse self = new ReadWebhookContactSendTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public ReadWebhookContactSendTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadWebhookContactSendTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadWebhookContactSendTemplateListResponse setBody(ReadWebhookContactSendTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadWebhookContactSendTemplateListResponseBody getBody() {
        return this.body;
    }

}
