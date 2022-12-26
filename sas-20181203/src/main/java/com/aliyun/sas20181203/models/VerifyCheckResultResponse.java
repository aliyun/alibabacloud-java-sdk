// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyCheckResultResponseBody body;

    public static VerifyCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckResultResponse self = new VerifyCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyCheckResultResponse setBody(VerifyCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCheckResultResponseBody getBody() {
        return this.body;
    }

}
