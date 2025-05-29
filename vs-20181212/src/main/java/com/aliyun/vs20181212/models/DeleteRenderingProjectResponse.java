// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRenderingProjectResponseBody body;

    public static DeleteRenderingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingProjectResponse self = new DeleteRenderingProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRenderingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRenderingProjectResponse setBody(DeleteRenderingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRenderingProjectResponseBody getBody() {
        return this.body;
    }

}
