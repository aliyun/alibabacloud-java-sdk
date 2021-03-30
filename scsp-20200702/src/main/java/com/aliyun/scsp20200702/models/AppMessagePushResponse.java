// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class AppMessagePushResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppMessagePushResponseBody body;

    public static AppMessagePushResponse build(java.util.Map<String, ?> map) throws Exception {
        AppMessagePushResponse self = new AppMessagePushResponse();
        return TeaModel.build(map, self);
    }

    public AppMessagePushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppMessagePushResponse setBody(AppMessagePushResponseBody body) {
        this.body = body;
        return this;
    }
    public AppMessagePushResponseBody getBody() {
        return this.body;
    }

}
