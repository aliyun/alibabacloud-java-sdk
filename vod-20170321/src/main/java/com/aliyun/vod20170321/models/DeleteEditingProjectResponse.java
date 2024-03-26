// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEditingProjectResponseBody body;

    public static DeleteEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectResponse self = new DeleteEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEditingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEditingProjectResponse setBody(DeleteEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEditingProjectResponseBody getBody() {
        return this.body;
    }

}
