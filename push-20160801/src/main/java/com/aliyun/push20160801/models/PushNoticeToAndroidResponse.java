// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToAndroidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushNoticeToAndroidResponseBody body;

    public static PushNoticeToAndroidResponse build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToAndroidResponse self = new PushNoticeToAndroidResponse();
        return TeaModel.build(map, self);
    }

    public PushNoticeToAndroidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushNoticeToAndroidResponse setBody(PushNoticeToAndroidResponseBody body) {
        this.body = body;
        return this;
    }
    public PushNoticeToAndroidResponseBody getBody() {
        return this.body;
    }

}
