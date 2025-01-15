// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptRefineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunScriptRefineResponseBody body;

    public static RunScriptRefineResponse build(java.util.Map<String, ?> map) throws Exception {
        RunScriptRefineResponse self = new RunScriptRefineResponse();
        return TeaModel.build(map, self);
    }

    public RunScriptRefineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunScriptRefineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunScriptRefineResponse setBody(RunScriptRefineResponseBody body) {
        this.body = body;
        return this;
    }
    public RunScriptRefineResponseBody getBody() {
        return this.body;
    }

}
