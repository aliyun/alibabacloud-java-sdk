// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class RetryJobInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryJobInstanceResponseBody body;

    public static RetryJobInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryJobInstanceResponse self = new RetryJobInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RetryJobInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryJobInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryJobInstanceResponse setBody(RetryJobInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryJobInstanceResponseBody getBody() {
        return this.body;
    }

}
