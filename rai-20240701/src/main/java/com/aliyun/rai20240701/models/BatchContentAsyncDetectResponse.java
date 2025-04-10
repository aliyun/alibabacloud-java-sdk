// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class BatchContentAsyncDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchContentAsyncDetectResponseBody body;

    public static BatchContentAsyncDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchContentAsyncDetectResponse self = new BatchContentAsyncDetectResponse();
        return TeaModel.build(map, self);
    }

    public BatchContentAsyncDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchContentAsyncDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchContentAsyncDetectResponse setBody(BatchContentAsyncDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchContentAsyncDetectResponseBody getBody() {
        return this.body;
    }

}
