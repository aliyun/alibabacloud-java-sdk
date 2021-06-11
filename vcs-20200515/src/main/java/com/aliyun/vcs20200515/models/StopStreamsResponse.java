// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopStreamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopStreamsResponseBody body;

    public static StopStreamsResponse build(java.util.Map<String, ?> map) throws Exception {
        StopStreamsResponse self = new StopStreamsResponse();
        return TeaModel.build(map, self);
    }

    public StopStreamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopStreamsResponse setBody(StopStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public StopStreamsResponseBody getBody() {
        return this.body;
    }

}
