// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckReadableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckReadableResponseBody body;

    public static CheckReadableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckReadableResponse self = new CheckReadableResponse();
        return TeaModel.build(map, self);
    }

    public CheckReadableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckReadableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckReadableResponse setBody(CheckReadableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckReadableResponseBody getBody() {
        return this.body;
    }

}
