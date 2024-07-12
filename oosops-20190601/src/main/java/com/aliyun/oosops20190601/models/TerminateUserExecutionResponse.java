// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class TerminateUserExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateUserExecutionResponseBody body;

    public static TerminateUserExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateUserExecutionResponse self = new TerminateUserExecutionResponse();
        return TeaModel.build(map, self);
    }

    public TerminateUserExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateUserExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateUserExecutionResponse setBody(TerminateUserExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateUserExecutionResponseBody getBody() {
        return this.body;
    }

}
