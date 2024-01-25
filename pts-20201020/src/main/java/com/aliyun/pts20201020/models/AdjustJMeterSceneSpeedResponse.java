// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class AdjustJMeterSceneSpeedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AdjustJMeterSceneSpeedResponseBody body;

    public static AdjustJMeterSceneSpeedResponse build(java.util.Map<String, ?> map) throws Exception {
        AdjustJMeterSceneSpeedResponse self = new AdjustJMeterSceneSpeedResponse();
        return TeaModel.build(map, self);
    }

    public AdjustJMeterSceneSpeedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdjustJMeterSceneSpeedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AdjustJMeterSceneSpeedResponse setBody(AdjustJMeterSceneSpeedResponseBody body) {
        this.body = body;
        return this;
    }
    public AdjustJMeterSceneSpeedResponseBody getBody() {
        return this.body;
    }

}
