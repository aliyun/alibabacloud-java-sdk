// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchForbidVsStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchForbidVsStreamResponseBody body;

    public static BatchForbidVsStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchForbidVsStreamResponse self = new BatchForbidVsStreamResponse();
        return TeaModel.build(map, self);
    }

    public BatchForbidVsStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchForbidVsStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchForbidVsStreamResponse setBody(BatchForbidVsStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchForbidVsStreamResponseBody getBody() {
        return this.body;
    }

}
