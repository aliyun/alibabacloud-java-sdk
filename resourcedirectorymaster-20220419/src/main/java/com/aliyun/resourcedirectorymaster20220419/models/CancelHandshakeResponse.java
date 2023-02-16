// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CancelHandshakeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelHandshakeResponseBody body;

    public static CancelHandshakeResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelHandshakeResponse self = new CancelHandshakeResponse();
        return TeaModel.build(map, self);
    }

    public CancelHandshakeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelHandshakeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelHandshakeResponse setBody(CancelHandshakeResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelHandshakeResponseBody getBody() {
        return this.body;
    }

}
