// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptContinueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunScriptContinueResponseBody body;

    public static RunScriptContinueResponse build(java.util.Map<String, ?> map) throws Exception {
        RunScriptContinueResponse self = new RunScriptContinueResponse();
        return TeaModel.build(map, self);
    }

    public RunScriptContinueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunScriptContinueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunScriptContinueResponse setBody(RunScriptContinueResponseBody body) {
        this.body = body;
        return this;
    }
    public RunScriptContinueResponseBody getBody() {
        return this.body;
    }

}
