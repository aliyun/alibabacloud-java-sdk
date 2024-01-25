// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopDebugPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDebugPtsSceneResponseBody body;

    public static StopDebugPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDebugPtsSceneResponse self = new StopDebugPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public StopDebugPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDebugPtsSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDebugPtsSceneResponse setBody(StopDebugPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDebugPtsSceneResponseBody getBody() {
        return this.body;
    }

}
