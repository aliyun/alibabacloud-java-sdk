// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListObjectProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopListObjectProjectResponseBody body;

    public static PopListObjectProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListObjectProjectResponse self = new PopListObjectProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopListObjectProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListObjectProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListObjectProjectResponse setBody(PopListObjectProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListObjectProjectResponseBody getBody() {
        return this.body;
    }

}
