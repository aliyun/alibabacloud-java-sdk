// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchReceiveMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchReceiveMessageResponseBody body;

    public static BatchReceiveMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchReceiveMessageResponse self = new BatchReceiveMessageResponse();
        return TeaModel.build(map, self);
    }

    public BatchReceiveMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchReceiveMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchReceiveMessageResponse setBody(BatchReceiveMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchReceiveMessageResponseBody getBody() {
        return this.body;
    }

}
