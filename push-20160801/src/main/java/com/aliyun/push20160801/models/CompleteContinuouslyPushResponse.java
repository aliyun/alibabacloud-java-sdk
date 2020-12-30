// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CompleteContinuouslyPushResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteContinuouslyPushResponseBody body;

    public static CompleteContinuouslyPushResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteContinuouslyPushResponse self = new CompleteContinuouslyPushResponse();
        return TeaModel.build(map, self);
    }

    public CompleteContinuouslyPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteContinuouslyPushResponse setBody(CompleteContinuouslyPushResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteContinuouslyPushResponseBody getBody() {
        return this.body;
    }

}
