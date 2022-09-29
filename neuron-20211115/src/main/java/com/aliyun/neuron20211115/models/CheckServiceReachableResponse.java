// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CheckServiceReachableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckServiceReachableResponseBody body;

    public static CheckServiceReachableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceReachableResponse self = new CheckServiceReachableResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceReachableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceReachableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceReachableResponse setBody(CheckServiceReachableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceReachableResponseBody getBody() {
        return this.body;
    }

}
