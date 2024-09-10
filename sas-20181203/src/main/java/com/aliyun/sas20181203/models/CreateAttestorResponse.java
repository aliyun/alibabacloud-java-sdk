// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAttestorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAttestorResponseBody body;

    public static CreateAttestorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAttestorResponse self = new CreateAttestorResponse();
        return TeaModel.build(map, self);
    }

    public CreateAttestorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAttestorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAttestorResponse setBody(CreateAttestorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAttestorResponseBody getBody() {
        return this.body;
    }

}
