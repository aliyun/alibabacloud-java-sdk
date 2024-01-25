// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartDebugPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDebugPtsSceneResponseBody body;

    public static StartDebugPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDebugPtsSceneResponse self = new StartDebugPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public StartDebugPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDebugPtsSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDebugPtsSceneResponse setBody(StartDebugPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDebugPtsSceneResponseBody getBody() {
        return this.body;
    }

}
