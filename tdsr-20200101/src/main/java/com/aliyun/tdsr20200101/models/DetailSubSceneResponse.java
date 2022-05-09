// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailSubSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetailSubSceneResponseBody body;

    public static DetailSubSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailSubSceneResponse self = new DetailSubSceneResponse();
        return TeaModel.build(map, self);
    }

    public DetailSubSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetailSubSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetailSubSceneResponse setBody(DetailSubSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DetailSubSceneResponseBody getBody() {
        return this.body;
    }

}
