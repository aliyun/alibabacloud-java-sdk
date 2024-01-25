// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartPtsSceneResponseBody body;

    public static StartPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPtsSceneResponse self = new StartPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public StartPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPtsSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPtsSceneResponse setBody(StartPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPtsSceneResponseBody getBody() {
        return this.body;
    }

}
