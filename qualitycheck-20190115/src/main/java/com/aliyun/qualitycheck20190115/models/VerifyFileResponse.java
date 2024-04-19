// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class VerifyFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyFileResponseBody body;

    public static VerifyFileResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyFileResponse self = new VerifyFileResponse();
        return TeaModel.build(map, self);
    }

    public VerifyFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyFileResponse setBody(VerifyFileResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyFileResponseBody getBody() {
        return this.body;
    }

}
