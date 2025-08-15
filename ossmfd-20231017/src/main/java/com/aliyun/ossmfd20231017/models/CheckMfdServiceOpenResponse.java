// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class CheckMfdServiceOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckMfdServiceOpenResponseBody body;

    public static CheckMfdServiceOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMfdServiceOpenResponse self = new CheckMfdServiceOpenResponse();
        return TeaModel.build(map, self);
    }

    public CheckMfdServiceOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMfdServiceOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMfdServiceOpenResponse setBody(CheckMfdServiceOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMfdServiceOpenResponseBody getBody() {
        return this.body;
    }

}
