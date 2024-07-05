// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRenderingInstanceResponseBody body;

    public static CreateRenderingInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingInstanceResponse self = new CreateRenderingInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRenderingInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRenderingInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRenderingInstanceResponse setBody(CreateRenderingInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRenderingInstanceResponseBody getBody() {
        return this.body;
    }

}
