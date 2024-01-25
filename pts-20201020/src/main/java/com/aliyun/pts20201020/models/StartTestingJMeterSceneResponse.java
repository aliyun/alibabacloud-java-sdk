// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartTestingJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTestingJMeterSceneResponseBody body;

    public static StartTestingJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTestingJMeterSceneResponse self = new StartTestingJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

    public StartTestingJMeterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTestingJMeterSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTestingJMeterSceneResponse setBody(StartTestingJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTestingJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
