// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CheckHealthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckHealthResponseBody body;

    public static CheckHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckHealthResponse self = new CheckHealthResponse();
        return TeaModel.build(map, self);
    }

    public CheckHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckHealthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckHealthResponse setBody(CheckHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckHealthResponseBody getBody() {
        return this.body;
    }

}
