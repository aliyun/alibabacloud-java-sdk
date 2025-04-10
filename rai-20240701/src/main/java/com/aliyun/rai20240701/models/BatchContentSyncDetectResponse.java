// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class BatchContentSyncDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchContentSyncDetectResponseBody body;

    public static BatchContentSyncDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchContentSyncDetectResponse self = new BatchContentSyncDetectResponse();
        return TeaModel.build(map, self);
    }

    public BatchContentSyncDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchContentSyncDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchContentSyncDetectResponse setBody(BatchContentSyncDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchContentSyncDetectResponseBody getBody() {
        return this.body;
    }

}
