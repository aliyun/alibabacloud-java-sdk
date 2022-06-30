// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RegisterDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterDeviceResponseBody body;

    public static RegisterDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceResponse self = new RegisterDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterDeviceResponse setBody(RegisterDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDeviceResponseBody getBody() {
        return this.body;
    }

}
