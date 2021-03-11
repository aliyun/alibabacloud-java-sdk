// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopRecordStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopRecordStreamResponseBody body;

    public static StopRecordStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRecordStreamResponse self = new StopRecordStreamResponse();
        return TeaModel.build(map, self);
    }

    public StopRecordStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRecordStreamResponse setBody(StopRecordStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRecordStreamResponseBody getBody() {
        return this.body;
    }

}
