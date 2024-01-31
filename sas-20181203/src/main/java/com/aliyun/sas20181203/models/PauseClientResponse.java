// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PauseClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseClientResponseBody body;

    public static PauseClientResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseClientResponse self = new PauseClientResponse();
        return TeaModel.build(map, self);
    }

    public PauseClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseClientResponse setBody(PauseClientResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseClientResponseBody getBody() {
        return this.body;
    }

}
