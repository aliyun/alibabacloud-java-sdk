// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnlockDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UnlockDeviceResponse setBody(UnlockDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockDeviceResponseBody getBody() {
        return this.body;
    }

}
