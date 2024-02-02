// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildPakRenderProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopBuildPakRenderProjectResponseBody body;

    public static PopBuildPakRenderProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopBuildPakRenderProjectResponse self = new PopBuildPakRenderProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopBuildPakRenderProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopBuildPakRenderProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopBuildPakRenderProjectResponse setBody(PopBuildPakRenderProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopBuildPakRenderProjectResponseBody getBody() {
        return this.body;
    }

}
