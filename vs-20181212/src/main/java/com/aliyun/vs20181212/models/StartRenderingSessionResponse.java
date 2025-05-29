// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartRenderingSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRenderingSessionResponseBody body;

    public static StartRenderingSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRenderingSessionResponse self = new StartRenderingSessionResponse();
        return TeaModel.build(map, self);
    }

    public StartRenderingSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRenderingSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRenderingSessionResponse setBody(StartRenderingSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRenderingSessionResponseBody getBody() {
        return this.body;
    }

}
