// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DropSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DropSceneResponseBody body;

    public static DropSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DropSceneResponse self = new DropSceneResponse();
        return TeaModel.build(map, self);
    }

    public DropSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DropSceneResponse setBody(DropSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DropSceneResponseBody getBody() {
        return this.body;
    }

}
