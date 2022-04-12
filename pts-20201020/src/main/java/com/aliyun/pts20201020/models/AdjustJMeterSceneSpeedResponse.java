// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class AdjustJMeterSceneSpeedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AdjustJMeterSceneSpeedResponse setBody(AdjustJMeterSceneSpeedResponseBody body) {
        this.body = body;
        return this;
    }
    public AdjustJMeterSceneSpeedResponseBody getBody() {
        return this.body;
    }

}
