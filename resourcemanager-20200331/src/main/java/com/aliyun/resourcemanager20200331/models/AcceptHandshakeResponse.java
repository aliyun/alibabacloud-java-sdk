// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AcceptHandshakeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AcceptHandshakeResponse setBody(AcceptHandshakeResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptHandshakeResponseBody getBody() {
        return this.body;
    }

}
