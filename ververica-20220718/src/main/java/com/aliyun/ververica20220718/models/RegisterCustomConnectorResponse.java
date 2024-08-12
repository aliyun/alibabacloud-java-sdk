// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class RegisterCustomConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterCustomConnectorResponseBody body;

    public static RegisterCustomConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterCustomConnectorResponse self = new RegisterCustomConnectorResponse();
        return TeaModel.build(map, self);
    }

    public RegisterCustomConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterCustomConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterCustomConnectorResponse setBody(RegisterCustomConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterCustomConnectorResponseBody getBody() {
        return this.body;
    }

}
