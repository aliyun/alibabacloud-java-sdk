// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchSendMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSendMessageResponseBody body;

    public static BatchSendMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageResponse self = new BatchSendMessageResponse();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSendMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSendMessageResponse setBody(BatchSendMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSendMessageResponseBody getBody() {
        return this.body;
    }

}
