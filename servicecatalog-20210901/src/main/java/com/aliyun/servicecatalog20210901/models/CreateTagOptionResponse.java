// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateTagOptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTagOptionResponseBody body;

    public static CreateTagOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagOptionResponse self = new CreateTagOptionResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTagOptionResponse setBody(CreateTagOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagOptionResponseBody getBody() {
        return this.body;
    }

}
