// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class PushFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushFileResponseBody body;

    public static PushFileResponse build(java.util.Map<String, ?> map) throws Exception {
        PushFileResponse self = new PushFileResponse();
        return TeaModel.build(map, self);
    }

    public PushFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushFileResponse setBody(PushFileResponseBody body) {
        this.body = body;
        return this;
    }
    public PushFileResponseBody getBody() {
        return this.body;
    }

}
