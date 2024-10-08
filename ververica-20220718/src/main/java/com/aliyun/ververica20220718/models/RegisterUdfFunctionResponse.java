// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class RegisterUdfFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterUdfFunctionResponseBody body;

    public static RegisterUdfFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterUdfFunctionResponse self = new RegisterUdfFunctionResponse();
        return TeaModel.build(map, self);
    }

    public RegisterUdfFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterUdfFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterUdfFunctionResponse setBody(RegisterUdfFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterUdfFunctionResponseBody getBody() {
        return this.body;
    }

}
