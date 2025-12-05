// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SuspendTrafficResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendTrafficResponseBody body;

    public static SuspendTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendTrafficResponse self = new SuspendTrafficResponse();
        return TeaModel.build(map, self);
    }

    public SuspendTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendTrafficResponse setBody(SuspendTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendTrafficResponseBody getBody() {
        return this.body;
    }

}
