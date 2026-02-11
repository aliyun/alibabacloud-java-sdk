// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CreateModelingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelingProjectResponseBody body;

    public static CreateModelingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelingProjectResponse self = new CreateModelingProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelingProjectResponse setBody(CreateModelingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelingProjectResponseBody getBody() {
        return this.body;
    }

}
