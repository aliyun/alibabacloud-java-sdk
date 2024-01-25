// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopDebuggingJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDebuggingJMeterSceneResponseBody body;

    public static StopDebuggingJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDebuggingJMeterSceneResponse self = new StopDebuggingJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

    public StopDebuggingJMeterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDebuggingJMeterSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDebuggingJMeterSceneResponse setBody(StopDebuggingJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDebuggingJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
