// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgenticDBProjectResponseBody body;

    public static CreateAgenticDBProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBProjectResponse self = new CreateAgenticDBProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgenticDBProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgenticDBProjectResponse setBody(CreateAgenticDBProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgenticDBProjectResponseBody getBody() {
        return this.body;
    }

}
