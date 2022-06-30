// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class VerifyDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyDeviceResponseBody body;

    public static VerifyDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceResponse self = new VerifyDeviceResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyDeviceResponse setBody(VerifyDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyDeviceResponseBody getBody() {
        return this.body;
    }

}
