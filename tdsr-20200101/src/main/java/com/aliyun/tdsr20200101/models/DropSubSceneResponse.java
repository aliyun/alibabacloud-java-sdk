// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DropSubSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DropSubSceneResponseBody body;

    public static DropSubSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DropSubSceneResponse self = new DropSubSceneResponse();
        return TeaModel.build(map, self);
    }

    public DropSubSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropSubSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DropSubSceneResponse setBody(DropSubSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DropSubSceneResponseBody getBody() {
        return this.body;
    }

}
