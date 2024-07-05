// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStopStreamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchStopStreamsResponseBody body;

    public static BatchStopStreamsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopStreamsResponse self = new BatchStopStreamsResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopStreamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopStreamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStopStreamsResponse setBody(BatchStopStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopStreamsResponseBody getBody() {
        return this.body;
    }

}
