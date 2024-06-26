// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CancelPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelPushResponseBody body;

    public static CancelPushResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPushResponse self = new CancelPushResponse();
        return TeaModel.build(map, self);
    }

    public CancelPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelPushResponse setBody(CancelPushResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPushResponseBody getBody() {
        return this.body;
    }

}
