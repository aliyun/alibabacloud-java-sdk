// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125.models;

import com.aliyun.tea.*;

public class SendBatchMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendBatchMessageResponseBody body;

    public static SendBatchMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendBatchMessageResponse self = new SendBatchMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendBatchMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendBatchMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendBatchMessageResponse setBody(SendBatchMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendBatchMessageResponseBody getBody() {
        return this.body;
    }

}
