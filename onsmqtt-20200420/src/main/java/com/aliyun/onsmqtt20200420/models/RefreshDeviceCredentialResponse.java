// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RefreshDeviceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshDeviceCredentialResponseBody body;

    public static RefreshDeviceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDeviceCredentialResponse self = new RefreshDeviceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDeviceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDeviceCredentialResponse setBody(RefreshDeviceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDeviceCredentialResponseBody getBody() {
        return this.body;
    }

}
