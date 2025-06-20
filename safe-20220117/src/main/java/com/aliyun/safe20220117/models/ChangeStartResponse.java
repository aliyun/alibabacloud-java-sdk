// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class ChangeStartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeStartResponseBody body;

    public static ChangeStartResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeStartResponse self = new ChangeStartResponse();
        return TeaModel.build(map, self);
    }

    public ChangeStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeStartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeStartResponse setBody(ChangeStartResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeStartResponseBody getBody() {
        return this.body;
    }

}
