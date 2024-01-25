// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopPtsSceneResponseBody body;

    public static StopPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StopPtsSceneResponse self = new StopPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public StopPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopPtsSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopPtsSceneResponse setBody(StopPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopPtsSceneResponseBody getBody() {
        return this.body;
    }

}
