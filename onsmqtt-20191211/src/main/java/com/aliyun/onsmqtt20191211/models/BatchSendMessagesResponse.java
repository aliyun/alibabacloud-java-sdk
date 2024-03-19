// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class BatchSendMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSendMessagesResponseBody body;

    public static BatchSendMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessagesResponse self = new BatchSendMessagesResponse();
        return TeaModel.build(map, self);
    }

    public BatchSendMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSendMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSendMessagesResponse setBody(BatchSendMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSendMessagesResponseBody getBody() {
        return this.body;
    }

}
