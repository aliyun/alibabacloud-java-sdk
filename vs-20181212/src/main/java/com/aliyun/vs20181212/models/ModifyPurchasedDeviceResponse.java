// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyPurchasedDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPurchasedDeviceResponseBody body;

    public static ModifyPurchasedDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPurchasedDeviceResponse self = new ModifyPurchasedDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPurchasedDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPurchasedDeviceResponse setBody(ModifyPurchasedDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPurchasedDeviceResponseBody getBody() {
        return this.body;
    }

}
