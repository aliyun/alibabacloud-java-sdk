// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRenderingProjectResponseBody body;

    public static CreateRenderingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingProjectResponse self = new CreateRenderingProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateRenderingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRenderingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRenderingProjectResponse setBody(CreateRenderingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRenderingProjectResponseBody getBody() {
        return this.body;
    }

}
