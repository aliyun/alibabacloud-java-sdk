// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchResumeVsStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchResumeVsStreamResponseBody body;

    public static BatchResumeVsStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchResumeVsStreamResponse self = new BatchResumeVsStreamResponse();
        return TeaModel.build(map, self);
    }

    public BatchResumeVsStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchResumeVsStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchResumeVsStreamResponse setBody(BatchResumeVsStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchResumeVsStreamResponseBody getBody() {
        return this.body;
    }

}
