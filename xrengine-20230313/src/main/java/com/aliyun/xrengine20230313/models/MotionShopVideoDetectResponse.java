// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class MotionShopVideoDetectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MotionShopVideoDetectResponseBody body;

    public static MotionShopVideoDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        MotionShopVideoDetectResponse self = new MotionShopVideoDetectResponse();
        return TeaModel.build(map, self);
    }

    public MotionShopVideoDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MotionShopVideoDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MotionShopVideoDetectResponse setBody(MotionShopVideoDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public MotionShopVideoDetectResponseBody getBody() {
        return this.body;
    }

}
