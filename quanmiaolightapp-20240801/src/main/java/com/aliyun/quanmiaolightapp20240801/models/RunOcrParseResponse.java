// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunOcrParseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunOcrParseResponseBody body;

    public static RunOcrParseResponse build(java.util.Map<String, ?> map) throws Exception {
        RunOcrParseResponse self = new RunOcrParseResponse();
        return TeaModel.build(map, self);
    }

    public RunOcrParseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunOcrParseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunOcrParseResponse setBody(RunOcrParseResponseBody body) {
        this.body = body;
        return this;
    }
    public RunOcrParseResponseBody getBody() {
        return this.body;
    }

}
