// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ResetUserExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetUserExecutionResponseBody body;

    public static ResetUserExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetUserExecutionResponse self = new ResetUserExecutionResponse();
        return TeaModel.build(map, self);
    }

    public ResetUserExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetUserExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetUserExecutionResponse setBody(ResetUserExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetUserExecutionResponseBody getBody() {
        return this.body;
    }

}
