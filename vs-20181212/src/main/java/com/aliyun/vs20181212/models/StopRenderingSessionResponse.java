// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopRenderingSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRenderingSessionResponseBody body;

    public static StopRenderingSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRenderingSessionResponse self = new StopRenderingSessionResponse();
        return TeaModel.build(map, self);
    }

    public StopRenderingSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRenderingSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRenderingSessionResponse setBody(StopRenderingSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRenderingSessionResponseBody getBody() {
        return this.body;
    }

}
