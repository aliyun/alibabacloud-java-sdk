// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterDeviceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RegisterDeviceCredentialResponse setBody(RegisterDeviceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDeviceCredentialResponseBody getBody() {
        return this.body;
    }

}
