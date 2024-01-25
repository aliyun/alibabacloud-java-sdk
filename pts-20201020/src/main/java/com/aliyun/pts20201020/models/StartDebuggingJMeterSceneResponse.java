// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartDebuggingJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDebuggingJMeterSceneResponseBody body;

    public static StartDebuggingJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDebuggingJMeterSceneResponse self = new StartDebuggingJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

    public StartDebuggingJMeterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDebuggingJMeterSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDebuggingJMeterSceneResponse setBody(StartDebuggingJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDebuggingJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
