// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnRegisterDeviceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnRegisterDeviceCredentialResponseBody body;

    public static UnRegisterDeviceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterDeviceCredentialResponse self = new UnRegisterDeviceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public UnRegisterDeviceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnRegisterDeviceCredentialResponse setBody(UnRegisterDeviceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public UnRegisterDeviceCredentialResponseBody getBody() {
        return this.body;
    }

}
