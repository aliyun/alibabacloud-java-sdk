// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushResponseBody body;

    public static PushResponse build(java.util.Map<String, ?> map) throws Exception {
        PushResponse self = new PushResponse();
        return TeaModel.build(map, self);
    }

    public PushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushResponse setBody(PushResponseBody body) {
        this.body = body;
        return this;
    }
    public PushResponseBody getBody() {
        return this.body;
    }

}
