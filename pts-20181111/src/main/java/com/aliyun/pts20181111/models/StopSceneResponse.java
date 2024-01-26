// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class StopSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopSceneResponseBody body;

    public static StopSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSceneResponse self = new StopSceneResponse();
        return TeaModel.build(map, self);
    }

    public StopSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSceneResponse setBody(StopSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSceneResponseBody getBody() {
        return this.body;
    }

}
