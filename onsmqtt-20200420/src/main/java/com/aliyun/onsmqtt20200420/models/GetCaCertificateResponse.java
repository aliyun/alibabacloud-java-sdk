// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCaCertificateResponseBody body;

    public static GetCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCaCertificateResponse self = new GetCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCaCertificateResponse setBody(GetCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCaCertificateResponseBody getBody() {
        return this.body;
    }

}
