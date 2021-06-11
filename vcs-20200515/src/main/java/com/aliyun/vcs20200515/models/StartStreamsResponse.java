// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartStreamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartStreamsResponseBody body;

    public static StartStreamsResponse build(java.util.Map<String, ?> map) throws Exception {
        StartStreamsResponse self = new StartStreamsResponse();
        return TeaModel.build(map, self);
    }

    public StartStreamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartStreamsResponse setBody(StartStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public StartStreamsResponseBody getBody() {
        return this.body;
    }

}
