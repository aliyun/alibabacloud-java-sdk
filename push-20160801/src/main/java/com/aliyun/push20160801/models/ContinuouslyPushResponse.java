// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ContinuouslyPushResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ContinuouslyPushResponseBody body;

    public static ContinuouslyPushResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuouslyPushResponse self = new ContinuouslyPushResponse();
        return TeaModel.build(map, self);
    }

    public ContinuouslyPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinuouslyPushResponse setBody(ContinuouslyPushResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinuouslyPushResponseBody getBody() {
        return this.body;
    }

}
