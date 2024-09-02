// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppGroupCredentialsResponseBody body;

    public static CreateAppGroupCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupCredentialsResponse self = new CreateAppGroupCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppGroupCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppGroupCredentialsResponse setBody(CreateAppGroupCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppGroupCredentialsResponseBody getBody() {
        return this.body;
    }

}
