// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class ChangeCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeCheckResponseBody body;

    public static ChangeCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckResponse self = new ChangeCheckResponse();
        return TeaModel.build(map, self);
    }

    public ChangeCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeCheckResponse setBody(ChangeCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeCheckResponseBody getBody() {
        return this.body;
    }

}
