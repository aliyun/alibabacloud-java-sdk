// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopDebuggingJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StopDebuggingJMeterSceneResponse setBody(StopDebuggingJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDebuggingJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
