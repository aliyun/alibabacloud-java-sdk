// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190522.models;

import com.aliyun.tea.*;

public class StartSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSceneResponseBody body;

    public static StartSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSceneResponse self = new StartSceneResponse();
        return TeaModel.build(map, self);
    }

    public StartSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSceneResponse setBody(StartSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSceneResponseBody getBody() {
        return this.body;
    }

}
