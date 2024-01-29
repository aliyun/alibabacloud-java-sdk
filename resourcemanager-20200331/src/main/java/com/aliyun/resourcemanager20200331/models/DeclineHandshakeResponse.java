// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeclineHandshakeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeclineHandshakeResponseBody body;

    public static DeclineHandshakeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeclineHandshakeResponse self = new DeclineHandshakeResponse();
        return TeaModel.build(map, self);
    }

    public DeclineHandshakeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeclineHandshakeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeclineHandshakeResponse setBody(DeclineHandshakeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeclineHandshakeResponseBody getBody() {
        return this.body;
    }

}
