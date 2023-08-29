// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class GenerateNonceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateNonceResponseBody body;

    public static GenerateNonceResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateNonceResponse self = new GenerateNonceResponse();
        return TeaModel.build(map, self);
    }

    public GenerateNonceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateNonceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateNonceResponse setBody(GenerateNonceResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateNonceResponseBody getBody() {
        return this.body;
    }

}
