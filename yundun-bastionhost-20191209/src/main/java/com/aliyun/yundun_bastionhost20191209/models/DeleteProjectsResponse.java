// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProjectsResponseBody body;

    public static DeleteProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectsResponse self = new DeleteProjectsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProjectsResponse setBody(DeleteProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectsResponseBody getBody() {
        return this.body;
    }

}
