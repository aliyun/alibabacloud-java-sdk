// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class CloseConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseConnectionResponseBody body;

    public static CloseConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseConnectionResponse self = new CloseConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CloseConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseConnectionResponse setBody(CloseConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseConnectionResponseBody getBody() {
        return this.body;
    }

}
