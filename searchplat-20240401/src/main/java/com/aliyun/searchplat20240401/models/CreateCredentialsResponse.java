// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCredentialsResponseBody body;

    public static CreateCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialsResponse self = new CreateCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public CreateCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCredentialsResponse setBody(CreateCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCredentialsResponseBody getBody() {
        return this.body;
    }

}
