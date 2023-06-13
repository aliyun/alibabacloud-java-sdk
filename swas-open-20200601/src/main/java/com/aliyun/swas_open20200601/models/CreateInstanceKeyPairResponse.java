// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateInstanceKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceKeyPairResponseBody body;

    public static CreateInstanceKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceKeyPairResponse self = new CreateInstanceKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceKeyPairResponse setBody(CreateInstanceKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceKeyPairResponseBody getBody() {
        return this.body;
    }

}
