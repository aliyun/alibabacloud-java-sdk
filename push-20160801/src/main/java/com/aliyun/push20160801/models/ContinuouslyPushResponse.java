// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ContinuouslyPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ContinuouslyPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContinuouslyPushResponse setBody(ContinuouslyPushResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinuouslyPushResponseBody getBody() {
        return this.body;
    }

}
