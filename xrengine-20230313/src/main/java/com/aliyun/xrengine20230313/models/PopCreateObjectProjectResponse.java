// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateObjectProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopCreateObjectProjectResponseBody body;

    public static PopCreateObjectProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopCreateObjectProjectResponse self = new PopCreateObjectProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopCreateObjectProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopCreateObjectProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopCreateObjectProjectResponse setBody(PopCreateObjectProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopCreateObjectProjectResponseBody getBody() {
        return this.body;
    }

}
