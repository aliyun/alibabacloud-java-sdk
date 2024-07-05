// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStartStreamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchStartStreamsResponseBody body;

    public static BatchStartStreamsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStartStreamsResponse self = new BatchStartStreamsResponse();
        return TeaModel.build(map, self);
    }

    public BatchStartStreamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStartStreamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStartStreamsResponse setBody(BatchStartStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartStreamsResponseBody getBody() {
        return this.body;
    }

}
