// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class EndSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndSessionResponseBody body;

    public static EndSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        EndSessionResponse self = new EndSessionResponse();
        return TeaModel.build(map, self);
    }

    public EndSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndSessionResponse setBody(EndSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public EndSessionResponseBody getBody() {
        return this.body;
    }

}
