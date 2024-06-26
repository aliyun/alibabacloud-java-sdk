// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToAndroidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public PushMessageToAndroidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushMessageToAndroidResponse setBody(PushMessageToAndroidResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMessageToAndroidResponseBody getBody() {
        return this.body;
    }

}
