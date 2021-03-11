// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStartStreamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchStartStreamsResponse setBody(BatchStartStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartStreamsResponseBody getBody() {
        return this.body;
    }

}
