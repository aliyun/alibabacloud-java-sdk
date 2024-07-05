// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnlockDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnlockDeviceResponseBody body;

    public static UnlockDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockDeviceResponse self = new UnlockDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnlockDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockDeviceResponse setBody(UnlockDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockDeviceResponseBody getBody() {
        return this.body;
    }

}
