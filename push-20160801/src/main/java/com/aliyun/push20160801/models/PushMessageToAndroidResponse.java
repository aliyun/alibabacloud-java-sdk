// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToAndroidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushMessageToAndroidResponseBody body;

    public static PushMessageToAndroidResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMessageToAndroidResponse self = new PushMessageToAndroidResponse();
        return TeaModel.build(map, self);
    }

    public PushMessageToAndroidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushMessageToAndroidResponse setBody(PushMessageToAndroidResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMessageToAndroidResponseBody getBody() {
        return this.body;
    }

}
