// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsOpenAPIProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOmsOpenAPIProjectResponseBody body;

    public static CreateOmsOpenAPIProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsOpenAPIProjectResponse self = new CreateOmsOpenAPIProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateOmsOpenAPIProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOmsOpenAPIProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOmsOpenAPIProjectResponse setBody(CreateOmsOpenAPIProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

}
