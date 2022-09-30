// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsOpenAPIProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOmsOpenAPIProjectResponseBody body;

    public static DeleteOmsOpenAPIProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsOpenAPIProjectResponse self = new DeleteOmsOpenAPIProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOmsOpenAPIProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOmsOpenAPIProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOmsOpenAPIProjectResponse setBody(DeleteOmsOpenAPIProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

}
