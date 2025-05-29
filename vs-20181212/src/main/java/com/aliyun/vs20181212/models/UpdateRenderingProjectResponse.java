// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRenderingProjectResponseBody body;

    public static UpdateRenderingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingProjectResponse self = new UpdateRenderingProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRenderingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRenderingProjectResponse setBody(UpdateRenderingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRenderingProjectResponseBody getBody() {
        return this.body;
    }

}
