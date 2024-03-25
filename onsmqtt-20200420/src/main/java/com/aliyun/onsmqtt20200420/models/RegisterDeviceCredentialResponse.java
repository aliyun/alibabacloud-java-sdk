// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterDeviceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterDeviceCredentialResponseBody body;

    public static RegisterDeviceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceCredentialResponse self = new RegisterDeviceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterDeviceCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterDeviceCredentialResponse setBody(RegisterDeviceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDeviceCredentialResponseBody getBody() {
        return this.body;
    }

}
