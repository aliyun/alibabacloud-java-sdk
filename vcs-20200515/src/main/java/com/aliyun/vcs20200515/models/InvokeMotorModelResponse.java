// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class InvokeMotorModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeMotorModelResponseBody body;

    public static InvokeMotorModelResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeMotorModelResponse self = new InvokeMotorModelResponse();
        return TeaModel.build(map, self);
    }

    public InvokeMotorModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeMotorModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeMotorModelResponse setBody(InvokeMotorModelResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeMotorModelResponseBody getBody() {
        return this.body;
    }

}
