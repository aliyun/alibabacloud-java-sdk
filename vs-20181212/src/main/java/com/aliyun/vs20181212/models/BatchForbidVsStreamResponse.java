// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchForbidVsStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchForbidVsStreamResponse setBody(BatchForbidVsStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchForbidVsStreamResponseBody getBody() {
        return this.body;
    }

}
