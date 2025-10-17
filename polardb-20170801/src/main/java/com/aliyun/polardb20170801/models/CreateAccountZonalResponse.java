// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAccountZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccountZonalResponseBody body;

    public static CreateAccountZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountZonalResponse self = new CreateAccountZonalResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccountZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccountZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccountZonalResponse setBody(CreateAccountZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccountZonalResponseBody getBody() {
        return this.body;
    }

}
