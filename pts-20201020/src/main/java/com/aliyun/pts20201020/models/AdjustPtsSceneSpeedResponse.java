// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class AdjustPtsSceneSpeedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AdjustPtsSceneSpeedResponseBody body;

    public static AdjustPtsSceneSpeedResponse build(java.util.Map<String, ?> map) throws Exception {
        AdjustPtsSceneSpeedResponse self = new AdjustPtsSceneSpeedResponse();
        return TeaModel.build(map, self);
    }

    public AdjustPtsSceneSpeedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdjustPtsSceneSpeedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AdjustPtsSceneSpeedResponse setBody(AdjustPtsSceneSpeedResponseBody body) {
        this.body = body;
        return this;
    }
    public AdjustPtsSceneSpeedResponseBody getBody() {
        return this.body;
    }

}
