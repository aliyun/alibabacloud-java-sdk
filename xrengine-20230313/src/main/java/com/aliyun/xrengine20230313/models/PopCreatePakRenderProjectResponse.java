// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreatePakRenderProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopCreatePakRenderProjectResponseBody body;

    public static PopCreatePakRenderProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopCreatePakRenderProjectResponse self = new PopCreatePakRenderProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopCreatePakRenderProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopCreatePakRenderProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopCreatePakRenderProjectResponse setBody(PopCreatePakRenderProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopCreatePakRenderProjectResponseBody getBody() {
        return this.body;
    }

}
