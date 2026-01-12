// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class CreateLocationServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLocationServiceResponseBody body;

    public static CreateLocationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLocationServiceResponse self = new CreateLocationServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateLocationServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLocationServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLocationServiceResponse setBody(CreateLocationServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLocationServiceResponseBody getBody() {
        return this.body;
    }

}
