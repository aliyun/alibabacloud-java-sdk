// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindPurchasedDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindPurchasedDeviceResponseBody body;

    public static BindPurchasedDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPurchasedDeviceResponse self = new BindPurchasedDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindPurchasedDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPurchasedDeviceResponse setBody(BindPurchasedDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPurchasedDeviceResponseBody getBody() {
        return this.body;
    }

}
