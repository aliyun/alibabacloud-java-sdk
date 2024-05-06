// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetHandshakeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetHandshakeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHandshakeResponse setBody(GetHandshakeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHandshakeResponseBody getBody() {
        return this.body;
    }

}
