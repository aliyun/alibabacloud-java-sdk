// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunStyleWritingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunStyleWritingResponseBody body;

    public static RunStyleWritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunStyleWritingResponse self = new RunStyleWritingResponse();
        return TeaModel.build(map, self);
    }

    public RunStyleWritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunStyleWritingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunStyleWritingResponse setBody(RunStyleWritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunStyleWritingResponseBody getBody() {
        return this.body;
    }

}
