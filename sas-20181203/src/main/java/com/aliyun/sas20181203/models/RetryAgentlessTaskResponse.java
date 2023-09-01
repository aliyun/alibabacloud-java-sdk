// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RetryAgentlessTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RetryAgentlessTaskResponseBody body;

    public static RetryAgentlessTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryAgentlessTaskResponse self = new RetryAgentlessTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryAgentlessTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryAgentlessTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryAgentlessTaskResponse setBody(RetryAgentlessTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryAgentlessTaskResponseBody getBody() {
        return this.body;
    }

}
