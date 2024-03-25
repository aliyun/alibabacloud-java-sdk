// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetDeviceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceCredentialResponseBody body;

    public static GetDeviceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCredentialResponse self = new GetDeviceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceCredentialResponse setBody(GetDeviceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceCredentialResponseBody getBody() {
        return this.body;
    }

}
