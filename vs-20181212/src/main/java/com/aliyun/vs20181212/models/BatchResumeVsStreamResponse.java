// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchResumeVsStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchResumeVsStreamResponse setBody(BatchResumeVsStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchResumeVsStreamResponseBody getBody() {
        return this.body;
    }

}
