// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RefreshDeviceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RefreshDeviceCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDeviceCredentialResponse setBody(RefreshDeviceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDeviceCredentialResponseBody getBody() {
        return this.body;
    }

}
