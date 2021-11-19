// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopTestingJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopTestingJMeterSceneResponseBody body;

    public static StopTestingJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTestingJMeterSceneResponse self = new StopTestingJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

    public StopTestingJMeterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTestingJMeterSceneResponse setBody(StopTestingJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTestingJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
