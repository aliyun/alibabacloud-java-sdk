// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ResetUserExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
