// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CheckSLRResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSLRResponseBody body;

    public static CheckSLRResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSLRResponse self = new CheckSLRResponse();
        return TeaModel.build(map, self);
    }

    public CheckSLRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSLRResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSLRResponse setBody(CheckSLRResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSLRResponseBody getBody() {
        return this.body;
    }

}
