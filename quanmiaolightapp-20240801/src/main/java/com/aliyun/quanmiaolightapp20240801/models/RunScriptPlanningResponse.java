// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptPlanningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunScriptPlanningResponseBody body;

    public static RunScriptPlanningResponse build(java.util.Map<String, ?> map) throws Exception {
        RunScriptPlanningResponse self = new RunScriptPlanningResponse();
        return TeaModel.build(map, self);
    }

    public RunScriptPlanningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunScriptPlanningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunScriptPlanningResponse setBody(RunScriptPlanningResponseBody body) {
        this.body = body;
        return this;
    }
    public RunScriptPlanningResponseBody getBody() {
        return this.body;
    }

}
