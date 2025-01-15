// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunScriptChatResponseBody body;

    public static RunScriptChatResponse build(java.util.Map<String, ?> map) throws Exception {
        RunScriptChatResponse self = new RunScriptChatResponse();
        return TeaModel.build(map, self);
    }

    public RunScriptChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunScriptChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunScriptChatResponse setBody(RunScriptChatResponseBody body) {
        this.body = body;
        return this;
    }
    public RunScriptChatResponseBody getBody() {
        return this.body;
    }

}
