// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RollbackSubSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackSubSceneResponseBody body;

    public static RollbackSubSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackSubSceneResponse self = new RollbackSubSceneResponse();
        return TeaModel.build(map, self);
    }

    public RollbackSubSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackSubSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackSubSceneResponse setBody(RollbackSubSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackSubSceneResponseBody getBody() {
        return this.body;
    }

}
