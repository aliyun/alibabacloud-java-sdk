// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindPurchasedDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindPurchasedDeviceResponseBody body;

    public static UnbindPurchasedDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindPurchasedDeviceResponse self = new UnbindPurchasedDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindPurchasedDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindPurchasedDeviceResponse setBody(UnbindPurchasedDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindPurchasedDeviceResponseBody getBody() {
        return this.body;
    }

}
