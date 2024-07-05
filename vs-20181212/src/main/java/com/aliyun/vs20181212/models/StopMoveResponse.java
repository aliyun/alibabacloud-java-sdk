// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopMoveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopMoveResponseBody body;

    public static StopMoveResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMoveResponse self = new StopMoveResponse();
        return TeaModel.build(map, self);
    }

    public StopMoveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMoveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMoveResponse setBody(StopMoveResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMoveResponseBody getBody() {
        return this.body;
    }

}
