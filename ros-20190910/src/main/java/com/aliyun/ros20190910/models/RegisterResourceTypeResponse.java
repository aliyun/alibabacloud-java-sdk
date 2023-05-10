// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class RegisterResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterResourceTypeResponseBody body;

    public static RegisterResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterResourceTypeResponse self = new RegisterResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public RegisterResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterResourceTypeResponse setBody(RegisterResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterResourceTypeResponseBody getBody() {
        return this.body;
    }

}
