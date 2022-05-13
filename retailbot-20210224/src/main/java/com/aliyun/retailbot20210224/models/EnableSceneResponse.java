// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class EnableSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSceneResponseBody body;

    public static EnableSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneResponse self = new EnableSceneResponse();
        return TeaModel.build(map, self);
    }

    public EnableSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSceneResponse setBody(EnableSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSceneResponseBody getBody() {
        return this.body;
    }

}
