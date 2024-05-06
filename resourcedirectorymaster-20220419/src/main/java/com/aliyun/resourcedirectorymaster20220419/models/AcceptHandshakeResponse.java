// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AcceptHandshakeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptHandshakeResponseBody body;

    public static AcceptHandshakeResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptHandshakeResponse self = new AcceptHandshakeResponse();
        return TeaModel.build(map, self);
    }

    public AcceptHandshakeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptHandshakeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptHandshakeResponse setBody(AcceptHandshakeResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptHandshakeResponseBody getBody() {
        return this.body;
    }

}
