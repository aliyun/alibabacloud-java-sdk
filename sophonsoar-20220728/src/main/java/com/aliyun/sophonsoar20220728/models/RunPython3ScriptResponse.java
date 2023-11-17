// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunPython3ScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RunPython3ScriptResponseBody body;

    public static RunPython3ScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPython3ScriptResponse self = new RunPython3ScriptResponse();
        return TeaModel.build(map, self);
    }

    public RunPython3ScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPython3ScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunPython3ScriptResponse setBody(RunPython3ScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPython3ScriptResponseBody getBody() {
        return this.body;
    }

}
