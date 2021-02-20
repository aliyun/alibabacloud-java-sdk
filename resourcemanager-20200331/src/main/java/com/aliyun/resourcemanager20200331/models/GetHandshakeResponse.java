// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetHandshakeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHandshakeResponseBody body;

    public static GetHandshakeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHandshakeResponse self = new GetHandshakeResponse();
        return TeaModel.build(map, self);
    }

    public GetHandshakeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHandshakeResponse setBody(GetHandshakeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHandshakeResponseBody getBody() {
        return this.body;
    }

}
